package net.mcreator.liaxlogasmp.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class ProcedureKokocuboItemInHandTick extends ElementsLiAxLoGasmp.ModElement {
	public ProcedureKokocuboItemInHandTick(ElementsLiAxLoGasmp instance) {
		super(instance, 39);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KokocuboItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 5, (int) 3, (false), (false)));
	}
}
