package com.act.norule.utils

import net.kyori.adventure.text.minimessage.MiniMessage

val String.mini
    get() = MiniMessage.miniMessage().deserialize(this)