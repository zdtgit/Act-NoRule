package com.act.norule.managers

import com.act.norule.plugin.NoRulePlugin
import com.act.norule.tasks.WoodTask

object TaskManager {
    private val plugin = NoRulePlugin.instance

    fun init() {
        WoodTask().runTaskTimer(plugin, 20L, 20L)
    }
}