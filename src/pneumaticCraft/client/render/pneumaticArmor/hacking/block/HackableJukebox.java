package pneumaticCraft.client.render.pneumaticArmor.hacking.block;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import pneumaticCraft.api.client.pneumaticHelmet.IHackableBlock;

public class HackableJukebox implements IHackableBlock{
    @Override
    public String getId(){
        return null;
    }

    @Override
    public boolean canHack(World world, int x, int y, int z, EntityPlayer player){
        return world.getBlockMetadata(x, y, z) != 0;
    }

    @Override
    public void addInfo(World world, int x, int y, int z, List<String> curInfo, EntityPlayer player){
        curInfo.add("pneumaticHelmet.hacking.result.silence");
    }

    @Override
    public void addPostHackInfo(World world, int x, int y, int z, List<String> curInfo, EntityPlayer player){
        curInfo.add("pneumaticHelmet.hacking.finished.silenced");
    }

    @Override
    public int getHackTime(World world, int x, int y, int z, EntityPlayer player){
        return 100;
    }

    @Override
    public void onHackFinished(World world, int x, int y, int z, EntityPlayer player){
        world.getBlock(x, y, z).onBlockActivated(world, x, y, z, null, 0, 0, 0, 0);
    }

    @Override
    public boolean afterHackTick(World world, int x, int y, int z){
        return false;
    }

}
