package dev.potaro.multiprojectexample.b;

import org.bukkit.plugin.java.JavaPlugin;

public final class MultiProjectExampleB extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabled test plugin B");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled test plugin B");
    }
}
