package pneumaticCraft.common.sensor.pollSensors;

import buildcraft.core.utils.MathUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import org.lwjgl.util.Rectangle;
import pneumaticCraft.api.universalSensor.IBlockAndCoordinatePollSensor;
import pneumaticCraft.api.universalSensor.IPollSensorSetting;
import pneumaticCraft.lib.Log;

import java.util.ArrayList;
import java.util.List;

public class UserSetSensor implements IPollSensorSetting {

    @Override
    public String getSensorPath(){
        return "dispenser/Constant";
    }

    @Override
    public int getPollFrequency(){
        return 1;
    }

    @Override
    public boolean needsTextBox(){
        return true;
    }

    @Override
    public List<String> getDescription(){
        List<String> text = new ArrayList<String>();
        text.add("gui.universalSensor.desc.userSetSensor");
        return text;
    }

    @Override
    public int getRedstoneValue(World world, int x, int y, int z, int sensorRange, String textBoxText){
        try {
            return Math.min(15, Math.max(0, Integer.parseInt(textBoxText)));
        }catch(Exception e){
            return 0;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void drawAdditionalInfo(FontRenderer fontRenderer){}

    @Override
    public Rectangle needsSlot(){
        return null;
    }

}