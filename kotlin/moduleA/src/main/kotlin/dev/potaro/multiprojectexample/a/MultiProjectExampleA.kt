package dev.potaro.multiprojectexample.a

import org.bukkit.plugin.java.JavaPlugin

class MultiProjectExampleA : JavaPlugin() {

    override fun onEnable() {
        logger.info("Enabled test plugin A")
    }

    override fun onDisable() {
        logger.info("Disabled test plugin A")
    }
}
