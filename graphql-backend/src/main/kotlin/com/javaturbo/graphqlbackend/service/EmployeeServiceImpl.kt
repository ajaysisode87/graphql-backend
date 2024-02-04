package com.javaturbo.graphqlbackend.service

import com.javaturbo.graphqlbackend.exception.EmployeeNotFoundException
import com.javaturbo.graphqlbackend.model.Employee
import com.javaturbo.graphqlbackend.repository.EmployeeRepo
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(
    private val employeeRepo: EmployeeRepo
):EmployeeService {
    override fun registerEmployee(employee: Employee): Employee {
       return employeeRepo.save(employee)
    }

    override fun getAllEmployee(): MutableList<Employee> {
       return employeeRepo.findAll()
    }

    override fun deleteEmployee(id: UUID): Boolean =
        employeeRepo.findById(id)
            .orElseThrow { EmployeeNotFoundException("Employee", "EmployeeId", id) }
            .let { existingEmployee ->
                if (existingEmployee.id == id) {
                    employeeRepo.deleteById(id)
                    true
                } else {
                    false
                }
            }


    override fun updateEmployee(id: UUID, employee: Employee): Employee {
      val existingEmployee=this.employeeRepo
          .findById(id)
          .orElseThrow{ EmployeeNotFoundException("Employee","employeeId",id) }

      return  existingEmployee.let {
            existingEmployee.apply {
                name=employee.name
                emailId=employee.emailId
                password=employee.password
                age=employee.age
                currentSalary=employee.currentSalary
                dept=employee.dept
            }
        }.let(employeeRepo::save)
    }

    override fun getEmployeeById(id: UUID): Employee = this.employeeRepo
        .findById(id)
        .orElseThrow{ EmployeeNotFoundException("Employee","employeeId",id) }
    }
