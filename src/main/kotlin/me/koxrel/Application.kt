package me.koxrel

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("me.koxrel")
        .start()
}

