package com.news.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform