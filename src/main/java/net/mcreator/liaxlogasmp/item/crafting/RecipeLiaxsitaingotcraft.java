
package net.mcreator.liaxlogasmp.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.liaxlogasmp.item.ItemLiAxsitaingot;
import net.mcreator.liaxlogasmp.block.BlockLiAxSitaore;
import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class RecipeLiaxsitaingotcraft extends ElementsLiAxLoGasmp.ModElement {
	public RecipeLiaxsitaingotcraft(ElementsLiAxLoGasmp instance) {
		super(instance, 10);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLiAxSitaore.block, (int) (1)), new ItemStack(ItemLiAxsitaingot.block, (int) (1)), 1F);
	}
}
