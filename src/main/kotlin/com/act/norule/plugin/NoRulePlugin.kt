package com.act.norule.plugin

import com.act.norule.managers.TaskManager
import org.bukkit.plugin.java.JavaPlugin

class NoRulePlugin: JavaPlugin() {
    override fun onEnable() {
        TaskManager.init()
    }

    companion object {
        val instance
            get() = getPlugin(NoRulePlugin::class.java)
    }
}