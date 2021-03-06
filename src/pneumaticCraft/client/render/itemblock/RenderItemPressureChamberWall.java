package pneumaticCraft.client.render.itemblock;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import pneumaticCraft.client.model.ModelPressureChamberWindow;
import pneumaticCraft.lib.Textures;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderItemPressureChamberWall implements IItemRenderer{

    private final ModelPressureChamberWindow model;
    private final ModelPressureChamberWindow modelBlock;

    public RenderItemPressureChamberWall(){
        model = new ModelPressureChamberWindow();
        modelBlock = new ModelPressureChamberWindow();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type){

        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper){

        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data){
        boolean seeThrough = item.getItemDamage() == 6;
        switch(type){
            case ENTITY: {
                render(0.0F, 0.0F, 1.0F, 1.0F, seeThrough);
                return;
            }
            case EQUIPPED: {
                render(0.5F, -0.5F, 1.5F, 1.0F, seeThrough);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glRotatef(-90F, 0, 1F, 0);
                render(0.7F, 0.7F, 1.9F, 1.0F, seeThrough);
                return;
            }
            case INVENTORY: {
                render(0.0F, 0.0F, 1.0F, 1.0F, seeThrough);
                return;
            }
            default:
                return;
        }
    }

    private void render(float x, float y, float z, float scale, boolean seeThrough){

        GL11.glPushMatrix();
        // GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glRotatef(-90F, 1F, 0, 0);
        // Scale, Translate, Rotate
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(-90F, 1F, 0, 0);

        // Bind texture
        FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_AIR_COMPRESSOR);
        // Render
        if(seeThrough) model.renderModel(1F / 16F, true);
        else modelBlock.renderModel(1F / 16F, false);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        // GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
