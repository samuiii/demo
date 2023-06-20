package com.example.demo.Controller

import com.example.demo.Entity.Demo
import com.example.demo.Repository.DemoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val demoRepository: DemoRepository) {

    @GetMapping("/hook")
    fun demo(): MutableList<Demo> {
        return demoRepository.findAll()
    }

}