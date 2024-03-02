package com.kpo.emailer.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KpoEmailerApplication

fun main(args: Array<String>) {
    runApplication<KpoEmailerApplication>(*args)
}
