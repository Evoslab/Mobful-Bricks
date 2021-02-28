package com.evoslab.mobfulbricks.core.registry;

import com.evoslab.mobfulbricks.common.blocks.MobBrickBlock;
import com.evoslab.mobfulbricks.core.MobfulBricks;
import com.evoslab.mobfulbricks.core.other.MBMods;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MobfulBricks.MOD_ID, bus = Bus.MOD)
public class MBBlocks {
	
    public static final BlockSubRegistryHelper HELPER = MobfulBricks.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> BEE_BRICKS = HELPER.createBlock("bee_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BEE_BRICK_SLAB = HELPER.createBlock("bee_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BEE_BRICK_STAIRS = HELPER.createBlock("bee_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BEE_BRICK_WALL = HELPER.createBlock("bee_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BEE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "bee_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BLAZE_BRICKS = HELPER.createBlock("blaze_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLAZE_BRICK_SLAB = HELPER.createBlock("blaze_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLAZE_BRICK_STAIRS = HELPER.createBlock("blaze_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLAZE_BRICK_WALL = HELPER.createBlock("blaze_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BLAZE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "blaze_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> BOOFLO_BRICKS = HELPER.createCompatBlock(MBMods.ENDERGETIC_EXPANSION, "booflo_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BOOFLO_BRICK_SLAB = HELPER.createCompatBlock(MBMods.ENDERGETIC_EXPANSION, "booflo_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BOOFLO_BRICK_STAIRS = HELPER.createCompatBlock(MBMods.ENDERGETIC_EXPANSION, "booflo_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BOOFLO_BRICK_WALL = HELPER.createCompatBlock(MBMods.ENDERGETIC_EXPANSION, "booflo_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BOOFLO_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("booflo_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, MBMods.QUARK, MBMods.ENDERGETIC_EXPANSION);
    
    public static final RegistryObject<Block> CARMEN_BRICKS = HELPER.createBlock("carmen_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CARMEN_BRICK_SLAB = HELPER.createBlock("carmen_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CARMEN_BRICK_STAIRS = HELPER.createBlock("carmen_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CARMEN_BRICK_WALL = HELPER.createBlock("carmen_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CARMEN_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "carmen_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> HOGLIN_BRICKS = HELPER.createBlock("hoglin_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HOGLIN_BRICK_SLAB = HELPER.createBlock("hoglin_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HOGLIN_BRICK_STAIRS = HELPER.createBlock("hoglin_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HOGLIN_BRICK_WALL = HELPER.createBlock("hoglin_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> HOGLIN_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "hoglin_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> PANDA_BRICKS = HELPER.createBlock("panda_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PANDA_BRICK_SLAB = HELPER.createBlock("panda_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PANDA_BRICK_STAIRS = HELPER.createBlock("panda_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PANDA_BRICK_WALL = HELPER.createBlock("panda_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PANDA_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "panda_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> POLAR_BEAR_BRICKS = HELPER.createBlock("polar_bear_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLAR_BEAR_BRICK_SLAB = HELPER.createBlock("polar_bear_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLAR_BEAR_BRICK_STAIRS = HELPER.createBlock("polar_bear_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> POLAR_BEAR_BRICK_WALL = HELPER.createBlock("polar_bear_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> POLAR_BEAR_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "polar_bear_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> SLABFISH_BRICKS = HELPER.createCompatBlock(MBMods.ENVIRONMENTAL, "slabfish_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABFISH_BRICK_SLAB = HELPER.createCompatBlock(MBMods.ENVIRONMENTAL, "slabfish_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABFISH_BRICK_STAIRS = HELPER.createCompatBlock(MBMods.ENVIRONMENTAL, "slabfish_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABFISH_BRICK_WALL = HELPER.createCompatBlock(MBMods.ENVIRONMENTAL, "slabfish_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SLABFISH_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("slabfish_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS, MBMods.ENVIRONMENTAL, MBMods.QUARK);
    
    public static final RegistryObject<Block> SPUD_BRICKS = HELPER.createBlock("spud_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SPUD_BRICK_SLAB = HELPER.createBlock("spud_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SPUD_BRICK_STAIRS = HELPER.createBlock("spud_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SPUD_BRICK_WALL = HELPER.createBlock("spud_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SPUD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "spud_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> STEVE_BRICKS = HELPER.createBlock("steve_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STEVE_BRICK_SLAB = HELPER.createBlock("steve_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STEVE_BRICK_STAIRS = HELPER.createBlock("steve_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STEVE_BRICK_WALL = HELPER.createBlock("steve_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> STEVE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "steve_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
    public static final RegistryObject<Block> STRIDER_BRICKS = HELPER.createBlock("strider_bricks", () -> new MobBrickBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIDER_BRICK_SLAB = HELPER.createBlock("strider_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIDER_BRICK_STAIRS = HELPER.createBlock("strider_brick_stairs", () -> new AbnormalsStairsBlock(BEE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIDER_BRICK_WALL = HELPER.createBlock("strider_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> STRIDER_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(MBMods.QUARK, "strider_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    
}
