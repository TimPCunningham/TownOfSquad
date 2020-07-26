package io.github.timpcunningham.TownOfSquad;

import org.bukkit.plugin.java.JavaPlugin;

public class TownOfSquad extends JavaPlugin {
    private static TownOfSquad self;

    @Override
    public void onEnable() {
        self = this;
    }

    @Override
    public void onDisable() {

    }

    public TownOfSquad getInstance() {
        return self;
    }
}
