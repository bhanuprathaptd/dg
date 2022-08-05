package com.example

import com.example.config.Configuration
import com.example.digitalgold.*
import com.example.repository.CustomerInfoRepository
import com.example.repository.DatabaseFactory
import io.ktor.server.application.*
import kotlinx.coroutines.runBlocking



fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {

    Configuration.initConfig(this.environment)
    DatabaseFactory.init()

    val digitalGoldService= DigitalGoldService()

    digitalGoldService.getDataAndCallApi()


}

