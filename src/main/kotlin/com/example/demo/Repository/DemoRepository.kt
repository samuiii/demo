package com.example.demo.Repository

import com.example.demo.Entity.Demo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository : JpaRepository<Demo, Long> {
}