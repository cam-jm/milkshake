package io.github.camjm.milkshake;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MilkshakeMod implements ModInitializer {

	public static final CoilGeneric COIL_GENERIC = new CoilGeneric(Block.Settings.of(Material.STONE));
	public static final Crystal CRYSTAL = new Crystal(Block.Settings.of(Material.GLASS));

	@Override
	public void onInitialize() {
		System.out.println("Hello there! Cake is life.");
		Registry.register(Registry.BLOCK, new Identifier("milkshake", "coil_generic"), COIL_GENERIC);
        Registry.register(Registry.ITEM, new Identifier("milkshake", "coil_generic"), new BlockItem(COIL_GENERIC, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("milkshake", "crystal"), CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier("milkshake", "crystal"), new BlockItem(CRYSTAL, new Item.Settings().group(ItemGroup.MISC)));
        
	}
}