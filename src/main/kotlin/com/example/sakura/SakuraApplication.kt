package com.example.sakura

import com.example.sakura.repository.SakuraRepository
import com.example.sakura.service.SakuraService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.jdbc.core.JdbcTemplate
import java.io.File

@SpringBootApplication
class SakuraApplication(val jdbcTemplate: JdbcTemplate) : CommandLineRunner {
	override fun run(vararg args: String?) {
		val targetName = args[0]
		val fileList = File("src/main/resources/sql").listFiles()
		val service = SakuraService()
		val repository = SakuraRepository(jdbcTemplate)
		for(file in fileList) {
			print(repository.count(service.getSqlQuery(file.absolutePath), targetName))
		}
	}
}

fun main(args: Array<out String?>) {
	SpringApplication.run(SakuraApplication::class.java, *args)
}

