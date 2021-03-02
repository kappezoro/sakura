package com.example.sakura

import com.example.sakura.repository.SakuraRepository
import com.example.sakura.service.SakuraService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

@SpringBootApplication
class SakuraApplication

	@Autowired
	private lateinit var service: SakuraService

	@Autowired
	private lateinit var repository: SakuraRepository

fun main() {
		val query = service.getSqlQuery("src/main/resources/sql/check_staff_duplicate.sql")
		val result = repository.count(query);
		print(result)
		//service.allUsers
	}

