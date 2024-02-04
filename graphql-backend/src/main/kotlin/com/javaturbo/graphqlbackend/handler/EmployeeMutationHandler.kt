package com.javaturbo.graphqlbackend.handler

import com.javaturbo.graphqlbackend.model.Employee
import com.javaturbo.graphqlbackend.service.EmployeeService
import jakarta.transaction.Transactional
import org.springframework.stereotype.Component
import java.util.*

@Component
@Transactional
class EmployeeMutationHandler(
    private val employeeService: EmployeeService
) {

    fun registerEmployee(employee: Employee):Employee= employeeService.registerEmployee(employee)

    fun updateEmployee(id: UUID, employee: Employee):Employee = employeeService.updateEmployee(id,employee)

    fun deleteEmployee(id: UUID):Boolean = employeeService.deleteEmployee(id)
}