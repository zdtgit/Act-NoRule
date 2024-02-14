package com.act.norule.tasks

import com.act.norule.utils.mini
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.scheduler.BukkitRunnable

class WoodTask: BukkitRunnable() {
    private var time = 0

    override fun run() {
        if (time <= 0) {
            Bukkit.broadcast("<blue><bold>나무<gray>가 지급되었습니다".mini)

            for (player in Bukkit.getOnlinePlayers()) {
                player.inventory.addItem(ItemStack(Material.OAK_LOG, 64))
            }

            time = 60
        } else {
            for (player in Bukkit.getOnlinePlayers()) {
                player.sendActionBar("<blue><bold>나무 <gray>지급까지 <green>${time}초".mini)
            }

            time--
        }
    }
}