package net.mcreator.liaxlogasmp.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.liaxlogasmp.item.ItemKokorita;
import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class ProcedureJojofanEntityDies extends ElementsLiAxLoGasmp.ModElement {
	public ProcedureJojofanEntityDies(ElementsLiAxLoGasmp instance) {
		super(instance, 36);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JojofanEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.7)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemKokorita.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
