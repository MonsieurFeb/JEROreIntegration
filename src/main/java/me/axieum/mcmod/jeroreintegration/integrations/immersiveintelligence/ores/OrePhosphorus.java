package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;

public class OrePhosphorus extends NetherOreBlock
{

	public OrePhosphorus()
	{
		super();
		oreConfig = Ores.orePhosphorus;
		this.setBlockMeta(0);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
