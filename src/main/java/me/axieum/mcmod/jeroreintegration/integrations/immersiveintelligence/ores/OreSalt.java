package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;

public class OreSalt extends OverworldOreBlock {
	public OreSalt() {
		super();
		oreConfig = Ores.oreSalt;
		this.setBlockMeta(4);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}
}
