package com.javaturbo.graphqlbackend.model

import jakarta.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import java.io.Serializable
import java.util.Date
import java.util.UUID

@Table(name = "employees")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
data class Employee(
    @Id
    val id:UUID,
    @Column
    var name: String,
    @Column
    var emailId:String,
    @Column
    var password:String,
    @Column
    var age:Int,
    @Column
    var currentSalary:Double,
    @Column
    var dept:String,
    @Temporal(TemporalType.TIMESTAMP)
    val createdDate: Date,
    @Temporal(TemporalType.TIMESTAMP)
    val updateDate: Date

):Serializable
