package com.javaturbo.graphqlbackend.resolver.types

import java.util.UUID

class EmployeeInput(
    id:UUID,
    name:String,
    emailId:String,
    password:String,
    age:Int,
    currentSalary:Float,
    dept:String
)