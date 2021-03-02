package com.example.sakura.service

import org.springframework.stereotype.Service
import java.nio.file.Files
import java.nio.file.Paths

@Service
class SakuraService {

    fun getSqlQuery(filepath:String):String{
        return Files.readString(Paths.get(filepath))
    }
}
