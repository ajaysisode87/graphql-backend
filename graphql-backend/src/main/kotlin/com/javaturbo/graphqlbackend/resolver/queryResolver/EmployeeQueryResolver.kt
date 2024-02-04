package com.javaturbo.graphqlbackend.resolver.queryResolver

import com.javaturbo.graphqlbackend.handler.EmployeeQueryHandler
import com.javaturbo.graphqlbackend.model.Employee
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class EmployeeQueryResolver(
    private val employeeQueryHandler: EmployeeQueryHandler
):GraphQLQueryResolver {

    fun getAll():MutableList<Employee> = employeeQueryHandler.getAllEmployee()

    fun getEmployeeById(id:UUID):Employee = employeeQueryHandler.getEmployeeById(id)

}