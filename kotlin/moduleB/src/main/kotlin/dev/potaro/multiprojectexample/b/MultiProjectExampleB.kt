package dev.potaro.multiprojectexample.b

import org.bukkit.plugin.java.JavaPlugin

class MultiProjectExampleB : JavaPlugin() {

    override fun onEnable() {
        logger.info("Enabled test plugin B")
    }

    override fun onDisable() {
        logger.info("Disabled test plugin B")
    }
}
