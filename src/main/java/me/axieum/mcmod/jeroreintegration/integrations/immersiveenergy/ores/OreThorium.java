package me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy.ores;

import crimson_twilight.immersive_energy.common.Config.IEnConfig.Ores;

public class OreThorium extends IEnOreBlock {
    public OreThorium() {
        super();
        oreConfig = Ores.ore_thorium;
        this.setBlockMeta(0);
        this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
    }
}
