package me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy.ores;

import crimson_twilight.immersive_energy.common.IEnContent;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.world.DimensionType;

public class IEnOreBlock extends OreBlock {

    protected static int [] oreConfig;

    public IEnOreBlock() {
        this.setBlock(IEnContent.blockOre);
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(false);
        this.setGenerationType(GenerationType.SQUARE);
        this.addDrops();
    }

}
