package me.axieum.mcmod.jeroreintegration.integrations.immersiveenergy.ores;

import crimson_twilight.immersive_energy.common.Config.IEnConfig.Ores;

public class OreTungsten extends IEnOreBlock {
    public OreTungsten() {
        super();
        oreConfig = Ores.ore_tungsten;
        this.setBlockMeta(1);
        this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
    }
}
