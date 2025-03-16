package me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy;

import me.axieum.mcmod.jeroreintegration.OreBlock;
import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy.ores.OreThorium;
import me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy.ores.OreTungsten;

import java.io.File;

public class ImmersiveEnergy {
    public static final OreBlock[] IEn_ORES = {
            new OreThorium(),
            new OreTungsten()
    };

    public static void init() {
        File ieFile = Config.getFile("immersiveenergy.json");
        if (ieFile == null)
            Integrate.write("immersiveenergy.json", IEn_ORES);
    }
}
