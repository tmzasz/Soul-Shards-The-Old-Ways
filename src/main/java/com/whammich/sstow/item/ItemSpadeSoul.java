package com.whammich.sstow.item;

import com.whammich.sstow.utils.Register;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpadeSoul extends ItemSpade {

	public ItemSpadeSoul(ToolMaterial Material) {
		super(Material);
		this.setUnlocalizedName("soul_spade");
		this.setCreativeTab(Register.CREATIVE_TAB);
		this.setMaxStackSize(1);
	}

	public String getUnlocalizedName(ItemStack stack) {
		return "item.sstow.soul_spade";
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("sstow:soul_spade");
	}
}
