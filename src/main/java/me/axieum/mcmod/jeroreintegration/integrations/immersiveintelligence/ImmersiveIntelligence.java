package me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence;

import java.io.File;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.immersiveintelligence.ores.*;

public class ImmersiveIntelligence
{

	public static final OreBlock[] IE_II_ORES = {
			new OreFluorite(),
			new OrePhosphorus(),
			new OrePlatinum(),
			new OreSalt(),
			new OreTungsten(),
			new OreZinc()
	};
	
	public static void init()
    {
        File ieFile = Config.getFile("immersiveintelligence.json");
        if (ieFile == null)
            Integrate.write("immersiveintelligence.json", IE_II_ORES);
    }

}
