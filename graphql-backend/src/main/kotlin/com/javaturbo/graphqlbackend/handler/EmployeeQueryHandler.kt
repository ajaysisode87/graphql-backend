package com.javaturbo.graphqlbackend.handler

import com.javaturbo.graphqlbackend.model.Employee
import com.javaturbo.graphqlbackend.service.EmployeeService
import jakarta.transaction.Transactional
import org.springframework.stereotype.Component
import java.util.UUID

@Component
@Transactional
class EmployeeQueryHandler(
    private val employeeService: EmployeeService
) {

    fun getAllEmployee():MutableList<Employee> = employeeService.getAllEmployee()

    fun getEmployeeById(id:UUID):Employee= employeeService.getEmployeeById(id)
}