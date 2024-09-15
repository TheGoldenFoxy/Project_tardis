package net.projecttardis.world.features.ores;

import net.projecttardis.init.ProjectTardisModBlocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.IRuleTestType;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Random;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber
public class TungstenoreFeature {
	private static Feature<OreFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;
	private static IRuleTestType<TungstenoreFeatureRuleTest> CUSTOM_MATCH = null;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class TungstenoreFeatureRuleTest extends RuleTest {
		static final TungstenoreFeatureRuleTest INSTANCE = new TungstenoreFeatureRuleTest();
		static final Codec<TungstenoreFeatureRuleTest> codec = Codec.unit(() -> INSTANCE);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt == Blocks.STONE.getDefaultState())
				blockCriteria = true;
			if (blockAt == Blocks.GRANITE.getDefaultState())
				blockCriteria = true;
			if (blockAt == Blocks.DIORITE.getDefaultState())
				blockCriteria = true;
			if (blockAt == Blocks.ANDESITE.getDefaultState())
				blockCriteria = true;
			return blockCriteria;
		}

		protected IRuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class TungstenoreFeatureRegisterHandler {
		@SubscribeEvent
		public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("project_tardis:tungstenore_match"), () -> TungstenoreFeatureRuleTest.codec);
			feature = new OreFeature(OreFeatureConfig.CODEC) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {

					return super.generate(world, generator, rand, pos, config);
				}
			};

			configuredFeature = feature.withConfiguration(new OreFeatureConfig(TungstenoreFeatureRuleTest.INSTANCE, ProjectTardisModBlocks.TUNGSTENORE.get().getDefaultState(), 12))
					.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(0, 0, 64))).square().func_242731_b(5);

			event.getRegistry().register(feature.setRegistryName("tungstenore_ores"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("project_tardis:tungstenore_ores"), configuredFeature);
		}
	}

	@SubscribeEvent
	public static void addFeatureToBiomes(BiomeLoadingEvent event) {
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> configuredFeature);
	}
}
