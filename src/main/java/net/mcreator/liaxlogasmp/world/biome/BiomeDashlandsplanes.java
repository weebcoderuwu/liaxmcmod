
package net.mcreator.liaxlogasmp.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import net.mcreator.liaxlogasmp.entity.EntityJojofan;
import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

import java.util.Random;

@ElementsLiAxLoGasmp.ModElement.Tag
public class BiomeDashlandsplanes extends ElementsLiAxLoGasmp.ModElement {
	@GameRegistry.ObjectHolder("liaxlogasmp:dashlandsplanes")
	public static final BiomeGenCustom biome = null;
	public BiomeDashlandsplanes(ElementsLiAxLoGasmp instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Dashlandsplanes").setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F));
			setRegistryName("dashlandsplanes");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityJojofan.EntityCustom.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
