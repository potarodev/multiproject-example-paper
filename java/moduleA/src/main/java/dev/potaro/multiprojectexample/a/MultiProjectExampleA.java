package dev.potaro.multiprojectexample.a;

import org.bukkit.plugin.java.JavaPlugin;

public final class MultiProjectExampleA extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabled test plugin A");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled test plugin A");
    }
}
