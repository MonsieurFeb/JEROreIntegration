package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pl.pabilo8.immersiveintelligence.common.IIConfigHandler.IIConfig.Ores;
import pl.pabilo8.immersiveintelligence.common.item.crafting.material.ItemIIMaterialGem;

public class OreFluorite extends NetherOreBlock
{

	public OreFluorite()
	{
		super();
		// This should have added material to the tips, but it didn't.
//		Item item = new ItemIIMaterialGem();
//		this.addDrops(new ItemStack(item, 2, ItemIIMaterialGem.MaterialsGem.FLUORITE.getMeta()));
		oreConfig = Ores.oreFluorite;
		this.setBlockMeta(1);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
