package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;

public class OreTungsten extends OverworldOreBlock
{

	public OreTungsten()
	{
		super();
		oreConfig = Ores.oreTungsten;
		this.setBlockMeta(3);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
