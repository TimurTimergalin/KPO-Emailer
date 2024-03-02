package com.kpo.emailer.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.kpo.kpoemailerlogic", "com.kpo.emailer.app.controller")
class KpoEmailerApplication

fun main(args: Array<String>) {
    runApplication<KpoEmailerApplication>(*args)
}
