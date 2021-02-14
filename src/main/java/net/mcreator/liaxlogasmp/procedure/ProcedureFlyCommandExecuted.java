package net.mcreator.liaxlogasmp.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class ProcedureFlyCommandExecuted extends ElementsLiAxLoGasmp.ModElement {
	public ProcedureFlyCommandExecuted(ElementsLiAxLoGasmp instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FlyCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.allowFlying = (true);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
	}
}
