package me.axieum.mcmod.jeroreintegration.integrations.embers.ores;

import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.world.DimensionType;

public class EmbersOreBlock extends OreBlock
{

	public EmbersOreBlock()
	{
		this.setDimensionName(DimensionType.OVERWORLD.getName());
		this.setRequiresSilktouch(false);
		this.setGenerationType(GenerationType.SQUARE);
		this.addDrops();
	}

}
