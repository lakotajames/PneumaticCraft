package pneumaticCraft.client.render.pneumaticArmor.hacking.block;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import pneumaticCraft.api.client.pneumaticHelmet.IHackableBlock;

public class HackableNoteblock implements IHackableBlock{
    @Override
    public String getId(){
        return "noteBlock";
    }

    @Override
    public boolean canHack(World world, int x, int y, int z, EntityPlayer player){
        return true;
    }

    @Override
    public void addInfo(World world, int x, int y, int z, List<String> curInfo, EntityPlayer player){
        curInfo.add("pneumaticHelmet.hacking.result.makeSound");
    }

    @Override
    public void addPostHackInfo(World world, int x, int y, int z, List<String> curInfo, EntityPlayer player){
        curInfo.add("pneumaticHelmet.hacking.finished.makingSound");
    }

    @Override
    public int getHackTime(World world, int x, int y, int z, EntityPlayer player){
        return 60;
    }

    @Override
    public void onHackFinished(World world, int x, int y, int z, EntityPlayer player){}

    @Override
    public boolean afterHackTick(World world, int x, int y, int z){
        world.getBlock(x, y, z).onBlockActivated(world, x, y, z, null, 0, 0, 0, 0);
        return true;
    }

}
