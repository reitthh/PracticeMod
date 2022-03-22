package net.reitthh.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reitthh.tutorialmod.TutorialMod;
import org.lwjgl.system.CallbackI;


public class ModBlocks {

    public static final Block MYHTRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().breakInstantly()), ItemGroup.MISC);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block,group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for" + TutorialMod.MOD_ID);
    }
}
