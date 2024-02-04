package com.javaturbo.graphqlbackend.repository

import com.javaturbo.graphqlbackend.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface EmployeeRepo:JpaRepository<Employee, UUID> {
}