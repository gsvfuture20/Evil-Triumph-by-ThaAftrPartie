package com.ThaAftrPartie.EvilTriumph.objects.blocks;

import java.util.List;

import com.ThaAftrPartie.EvilTriumph.Main;
import com.ThaAftrPartie.EvilTriumph.init.ModBlocks;
import com.ThaAftrPartie.EvilTriumph.init.ModItems;
import com.ThaAftrPartie.EvilTriumph.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class BlockBase extends Block implements IHasModel

{

	public BlockBase(String name, Material material)
	{

	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	
	ModBlocks.BLOCKS.add(this);
	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	
}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRednerer(Item.getItemFromBlock(this), 0, "inventory" );
		
	}



@Override
public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState) 
{
	
}

@Override
public boolean addDestroyEffects(World world, BlockPos pos, ParticleManager manager) 
{
	return super.addDestroyEffects(world, pos, manager);
}

@Override
public boolean addHitEffects(IBlockState state, World worldObj, RayTraceResult target, ParticleManager manager) 
{
	return super.addHitEffects(state, worldObj, target, manager);
}

public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) 
{
	
}


@Override
public boolean addLandingEffects(IBlockState state, WorldServer worldObj, BlockPos blockPosition, IBlockState iblockstate, EntityLivingBase entity, int numberOfParticles) 
{
	return super.addLandingEffects(state, worldObj, blockPosition, iblockstate, entity, numberOfParticles);
}


@Override
public boolean addRunningEffects(IBlockState state, World world, BlockPos pos, Entity entity) 
{
	return super.addRunningEffects(state, world, pos, entity);
}

@Override
public void beginLeavesDecay(IBlockState state, World world, BlockPos pos) 
{
	
}

@Override
public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
{
	
}

@Override
public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing) 
{
	return super.canBeConnectedTo(world, pos, facing);
}

@Override
public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos) 
{
	return super.canBeReplacedByLeaves(state, world, pos);
}

@Override
public boolean canCollideCheck(IBlockState state, boolean hitIfLiquid) 
{
	return super.canCollideCheck(state, hitIfLiquid);
}

@Override
public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) 
{
	return super.canConnectRedstone(state, world, pos, side);
}

@Override
public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, SpawnPlacementType type) 
{
	return super.canCreatureSpawn(state, world, pos, type);
}

@Override
public boolean canDropFromExplosion(Explosion explosionIn) 
{
	return super.canDropFromExplosion(explosionIn);
}

@Override
public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) 
{
	return super.canEntityDestroy(state, world, pos, entity);
}


@Override
@SuppressWarnings("deprecation")
public boolean canEntitySpawn(IBlockState state, Entity entityIn) 
{
	return super.canEntitySpawn(state, entityIn);
}

@Override
public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player) 
{
	return super.canHarvestBlock(world, pos, player);
}

@Override
public boolean canPlaceBlockAt(World worldIn, BlockPos pos) 
{
	return super.canPlaceBlockAt(worldIn, pos);
}

@Override
public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side) 
{
	return super.canPlaceBlockOnSide(worldIn, pos, side);
}

@Override
public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) 
{
	return super.canPlaceTorchOnTop(state, world, pos);
}

@SuppressWarnings("deprecation")
@Override
public boolean canProvidePower(IBlockState state)
{
	return super.canProvidePower(state);
}

@Override
public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) 
{
	return super.canRenderInLayer(state, layer);
}

@SuppressWarnings("deprecation")
@Override
protected boolean canSilkHarvest() 
{
	return super.canSilkHarvest();
}

@Override
public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) 
{
	return super.canSilkHarvest(world, pos, state, player);
}
}