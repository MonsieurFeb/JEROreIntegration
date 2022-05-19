package me.axieum.mcmod.jeroreintegration.integrations.embers;

import java.io.File;

import me.axieum.mcmod.jeroreintegration.OreBlock;
import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.embers.ores.*;

public class Embers {

	public static final OreBlock[] EMBERS_ORES = {
			new OreCopper()
	};
	
	public static void init()
    {
        File ieFile = Config.getFile("embers.json");
        if (ieFile == null)
            Integrate.write("embers.json", EMBERS_ORES);
    }

}
