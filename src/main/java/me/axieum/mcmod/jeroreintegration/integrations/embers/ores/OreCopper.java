package me.axieum.mcmod.jeroreintegration.integrations.embers.ores;

import teamroots.embers.RegistryManager;
import teamroots.embers.ConfigManager;

public class OreCopper extends EmbersOreBlock
{

	public OreCopper()
	{
		super();
		this.setBlock(RegistryManager.ore_copper);
		this.setGenerationValue(""+ConfigManager.copperVeinsPerChunk+','+ConfigManager.copperVeinSize+','+ConfigManager.copperMinY+','+ConfigManager.copperMaxY);
	}

}
