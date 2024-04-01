package com.obsidian.sync

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform