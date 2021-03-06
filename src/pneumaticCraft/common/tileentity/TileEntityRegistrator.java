package pneumaticCraft.common.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistrator{
    public static void init(){
        GameRegistry.registerTileEntity(TileEntityPressureTube.class, "TileEntityPressureTube");
        GameRegistry.registerTileEntity(TileEntityAirCompressor.class, "TileEntityAirCompressor");
        GameRegistry.registerTileEntity(TileEntityAirCannon.class, "TileEntityAirCannon");
        GameRegistry.registerTileEntity(TileEntityPressureChamberWall.class, "TileEntityPressureChamberWall");
        GameRegistry.registerTileEntity(TileEntityPressureChamberValve.class, "TileEntityPressureChamberValve");
        GameRegistry.registerTileEntity(TileEntityChargingStation.class, "TileEntityChargingStation");
        GameRegistry.registerTileEntity(TileEntityElevatorBase.class, "TileEntityElevatorBase");
        GameRegistry.registerTileEntity(TileEntityElevatorFrame.class, "TileEntityElevatorFrame");
        GameRegistry.registerTileEntity(TileEntityPressureChamberInterface.class, "TileEntityPressureChamberInterface");
        GameRegistry.registerTileEntity(TileEntityVacuumPump.class, "TileEntityVacuumPump");
        GameRegistry.registerTileEntity(TileEntityPneumaticDoorBase.class, "TileEntityPneumaticDoorBase");
        GameRegistry.registerTileEntity(TileEntityPneumaticDoor.class, "TileEntityPneumaticDoor");
        GameRegistry.registerTileEntity(TileEntityAssemblyIOUnit.class, "TileEntityAssemblyIOUnit");
        GameRegistry.registerTileEntity(TileEntityAssemblyPlatform.class, "TileEntityAssemblyPlatform");
        GameRegistry.registerTileEntity(TileEntityAssemblyDrill.class, "TileEntityAssemblyDrill");
        GameRegistry.registerTileEntity(TileEntityAssemblyLaser.class, "TileEntityAssemblyLaser");
        GameRegistry.registerTileEntity(TileEntityAssemblyController.class, "TileEntityAssemblyController");
        GameRegistry.registerTileEntity(TileEntityUVLightBox.class, "TileEntityUVLightBox");
        GameRegistry.registerTileEntity(TileEntitySecurityStation.class, "TileEntitySecurityStation");
        GameRegistry.registerTileEntity(TileEntityUniversalSensor.class, "TileEntityUniversalSensor");
        GameRegistry.registerTileEntity(TileEntityAerialInterface.class, "TileEntityAerialInterface");
        GameRegistry.registerTileEntity(TileEntityElectrostaticCompressor.class, "TileEntityElectrostaticCompressor");
        GameRegistry.registerTileEntity(TileEntityAphorismTile.class, "TileEntityAphorismTile");
        GameRegistry.registerTileEntity(TileEntityOmnidirectionalHopper.class, "TileEntityOmnidirectionalHopper");
        GameRegistry.registerTileEntity(TileEntityElevatorCaller.class, "TileEntityElevatorCaller");
        GameRegistry.registerTileEntity(TileEntityProgrammer.class, "TileEntityProgrammer");
        GameRegistry.registerTileEntity(TileEntityCreativeCompressor.class, "TileEntityCreativeCompressor");
    }

}
