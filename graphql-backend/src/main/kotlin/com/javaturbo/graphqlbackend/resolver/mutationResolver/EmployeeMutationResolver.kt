package com.javaturbo.graphqlbackend.resolver.mutationResolver

import com.javaturbo.graphqlbackend.handler.EmployeeMutationHandler
import com.javaturbo.graphqlbackend.model.Employee
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class EmployeeMutationResolver(
    private val employeeMutationHandler: EmployeeMutationHandler
):GraphQLMutationResolver {

    fun registerEmployee(employee: Employee):Employee = employeeMutationHandler.registerEmployee(employee)

    fun updateEmployee(id:UUID,employee: Employee):Employee = employeeMutationHandler.updateEmployee(id,employee)

    fun deleteEmployee(id: UUID):Boolean = employeeMutationHandler.deleteEmployee(id)
}