package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;

public class OrePlatinum  extends OverworldOreBlock
{
	protected static int [] oreConfig;

	public OrePlatinum() {
		oreConfig = Ores.orePlatinum;
		this.setBlockMeta(2);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
