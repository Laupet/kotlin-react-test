package com.okta.kotlin.resourceserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ResourceserverApplication

fun main(args: Array<String>) {
	runApplication<ResourceserverApplication>(*args)
}
