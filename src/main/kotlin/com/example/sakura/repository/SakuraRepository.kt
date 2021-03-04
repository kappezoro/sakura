package com.example.sakura.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository


@Repository
class SakuraRepository(private val jdbcTemplate: JdbcTemplate) {

    fun count(sql:String, targetName:String?):Int {
        return jdbcTemplate!!.queryForObject(sql, Int::class.java)!!
    }
    
}