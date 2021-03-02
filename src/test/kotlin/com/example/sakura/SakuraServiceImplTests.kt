package com.example.sakura

import com.example.sakura.repository.SakuraRepository
import com.example.sakura.service.SakuraService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SakuraServiceImplTests {

	@Autowired
	private lateinit var repository: SakuraRepository

	@Autowired
	private lateinit var service: SakuraService

	@Test
	fun testCountStaff() {
		val query = service.getSqlQuery("src/main/resources/sql/check_staff_duplicate.sql")
		val result = repository.count(query);
		assertThat(result).isEqualTo(0)
	}

}
