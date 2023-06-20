package com.example.demo.Entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Demo(
        @Id
        @GeneratedValue
        val id: Long
)