package dev.rotolo.multiplatformrealmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform