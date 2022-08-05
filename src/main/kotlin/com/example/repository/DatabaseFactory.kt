package com.example.repository

import com.example.config.Configuration
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database


    object DatabaseFactory {

        fun init(){
            Database.connect(hikari())


        }


        private fun hikari(): HikariDataSource {
            val config = HikariConfig()
            config.driverClassName =Configuration.env.driverName
            config.jdbcUrl =Configuration.env.databaseUrl
            config.maximumPoolSize = 3
            config.isAutoCommit = true
            config.transactionIsolation = "TRANSACTION_REPEATABLE_READ"
            config.validate()
            return HikariDataSource(config)
        }

    }
