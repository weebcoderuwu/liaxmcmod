
package net.mcreator.liaxlogasmp.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.liaxlogasmp.item.ItemSenkingot;
import net.mcreator.liaxlogasmp.block.BlockSenkore;
import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class RecipeSenkingotsmelt extends ElementsLiAxLoGasmp.ModElement {
	public RecipeSenkingotsmelt(ElementsLiAxLoGasmp instance) {
		super(instance, 21);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSenkore.block, (int) (1)), new ItemStack(ItemSenkingot.block, (int) (1)), 1F);
	}
}
