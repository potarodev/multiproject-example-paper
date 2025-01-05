package dev.potaro.multiprojectexample.libs

import org.bukkit.plugin.java.JavaPlugin

class MultiProjectExampleLibs : JavaPlugin() {

    override fun onEnable() {
        logger.info("Enabled libs plugin")
    }

    override fun onDisable() {
        logger.info("Disabled libs plugin")
    }
}
