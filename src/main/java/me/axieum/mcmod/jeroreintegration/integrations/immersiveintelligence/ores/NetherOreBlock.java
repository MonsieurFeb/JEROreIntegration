package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIContent;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.world.DimensionType;

public class NetherOreBlock extends OreBlock {

	protected static int [] oreConfig;
	
	public NetherOreBlock() {
		this.setBlock(IIContent.blockOre);
		this.setDimensionName(DimensionType.NETHER.getName());
		this.setRequiresSilktouch(true);
		this.setGenerationType(GenerationType.SQUARE);
		this.addDrops();
	}
}
