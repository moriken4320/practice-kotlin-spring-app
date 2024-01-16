package com.example.practicekotlinspringapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class PracticeKotlinSpringAppApplication {
	@GetMapping("/hello")
	fun hello(@RequestParam(value = "name", defaultValue = "World") name: String?): String {
		return String.format("Hello %s!", name)
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(PracticeKotlinSpringAppApplication::class.java, *args)
		}
	}
}