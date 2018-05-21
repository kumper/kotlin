package pl.kp.kotlin.firstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinAppApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinAppApplication>(*args)
}
