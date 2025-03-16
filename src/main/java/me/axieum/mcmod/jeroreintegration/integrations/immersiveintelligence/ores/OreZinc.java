package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;

public class OreZinc extends OverworldOreBlock
{

	public OreZinc()
	{
		super();
		oreConfig = Ores.oreZinc;
		this.setBlockMeta(5);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
