package net.pixeldreamstudios.beings_of_elderia;

import mod.azure.azurelib.config.Config;
import mod.azure.azurelib.config.Configurable;

@Config(id = BeingsOfElderia.MOD_ID)
public class BeingsOfElderiaConfig {
    @Configurable
    @Configurable.Synchronized
    public double demonHealth = 30.0;
    @Configurable
    @Configurable.Synchronized
    public double demonAttackDamage = 8.0;

    @Configurable
    @Configurable.Synchronized
    public double impHealth = 10.0;
    @Configurable
    @Configurable.Synchronized
    public double impAttackDamage = 3.0;

    @Configurable
    @Configurable.Synchronized
    public double impGuardHealth = 20.0;
    @Configurable
    @Configurable.Synchronized
    public double impGuardAttackDamage = 5.0;
    @Configurable
    @Configurable.Synchronized
    public double impGuardArmor = 6.0;

    // Spawn weights (set to 0 to disable spawning)
    @Configurable
    @Configurable.Synchronized
    public int demonSpawnWeight = 10;

    @Configurable
    @Configurable.Synchronized
    public int impSpawnWeight = 10;

    @Configurable
    @Configurable.Synchronized
    public int impGuardSpawnWeight = 10;
}
