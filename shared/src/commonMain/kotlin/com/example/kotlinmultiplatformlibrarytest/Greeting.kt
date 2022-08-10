package com.example.kotlinmultiplatformlibrarytest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}