
package net.mcreator.liaxlogasmp.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.liaxlogasmp.procedure.ProcedureJojoteriasItemIsCraftedsmelted;
import net.mcreator.liaxlogasmp.ElementsLiAxLoGasmp;

@ElementsLiAxLoGasmp.ModElement.Tag
public class ItemJojoterias extends ElementsLiAxLoGasmp.ModElement {
	@GameRegistry.ObjectHolder("liaxlogasmp:jojoterias")
	public static final Item block = null;
	public ItemJojoterias(ElementsLiAxLoGasmp instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("liaxlogasmp:jojoterias", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("jojoterias", ElementsLiAxLoGasmp.sounds.get(new ResourceLocation("liaxlogasmp:jojoterias")));
			setUnlocalizedName("jojoterias");
			setRegistryName("jojoterias");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
			super.onCreated(itemstack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureJojoteriasItemIsCraftedsmelted.executeProcedure($_dependencies);
			}
		}
	}
}
