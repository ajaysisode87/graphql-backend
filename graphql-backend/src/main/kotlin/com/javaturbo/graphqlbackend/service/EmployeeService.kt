package com.javaturbo.graphqlbackend.service

import com.javaturbo.graphqlbackend.model.Employee
import java.util.UUID

interface EmployeeService {

   fun registerEmployee(employee: Employee):Employee
   fun updateEmployee(id:UUID,employee: Employee):Employee
   fun getEmployeeById(id:UUID):Employee
   fun getAllEmployee():MutableList<Employee>
   fun deleteEmployee(id:UUID):Boolean



}