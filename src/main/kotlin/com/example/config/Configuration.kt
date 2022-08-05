package com.example.config

import io.ktor.server.application.*

object Configuration {

    lateinit var env: ConfigParameters

    fun initConfig(environment: ApplicationEnvironment) {
        env = ConfigParameters(
            databaseUrl = environment.config.property("ktor.db.database_url").getString(),
            databaseName = environment.config.property("ktor.db.name").getString(),
            databaseUserName = environment.config.property("ktor.db.username").getString(),
            databasePassword = environment.config.property("ktor.db.password").getString(),
            driverName = environment.config.property("ktor.db.driver_name").getString(),
        )
    }
}

