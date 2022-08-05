package com.example.digitalgold

import com.example.repository.CustomerInfoRepository
import kotlinx.coroutines.runBlocking

class DigitalGoldService {

    val data= CustomerInfoRepository.getAllCustomerInfo()

    fun getDataAndCallApi(){
        println("data from database")
        println(data);
        println(data.size)


        val bodyData= mutableListOf<DG>()


        for (i in 0..9){
            val customerInfo= data[i]
            bodyData.add(dataGenerator(customerInfo))
        }

        for (i in 0..9){
            println("generated data")
            println(bodyData[i])
        }


        runBlocking{
            val apiCall= DigitalGoldApi()

            for (i in 0..9) {
                apiCall.api(bodyData[i])
            }

        }
    }


}