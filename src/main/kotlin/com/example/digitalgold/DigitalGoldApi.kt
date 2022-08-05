package com.example.digitalgold

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement


class  DigitalGoldApi {

    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json()
        }


    }
     suspend fun api(body:DG){

//         println(Json.encodeToJsonElement(body))

         for (i in 1..10) {

             val response: HttpResponse =
                 client.post("https://dapi.tatadigital.com/api/v1/digigold/eventhub/transactionPublish") {


                     headers {
                         append(HttpHeaders.Authorization, "ui787s698hjiuif689as5kl878asfcgh65bd3giuj==")
                         append("client_id", "DIGITALGOLD-NON-POS")
                     }

                     contentType(ContentType.Application.Json)

                     setBody(body)
                 }

             println(response)
             println(response.bodyAsText())

         }



         client.close()


        }




}