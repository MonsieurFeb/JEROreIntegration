package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.world.DimensionType;
import pl.pabilo8.immersiveintelligence.common.IIContent;

public class OverworldOreBlock extends OreBlock {

    protected static int [] oreConfig;

    public OverworldOreBlock() {
        this.setBlock(IIContent.blockOre);
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(false);
        this.setGenerationType(GenerationType.SQUARE);
        this.addDrops();
    }
}
