package com.javaturbo.graphqlbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlBackendApplication

fun main(args: Array<String>) {
	runApplication<GraphqlBackendApplication>(*args)
}
