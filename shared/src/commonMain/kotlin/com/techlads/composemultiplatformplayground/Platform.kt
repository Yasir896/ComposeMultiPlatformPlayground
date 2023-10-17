package com.techlads.composemultiplatformplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform