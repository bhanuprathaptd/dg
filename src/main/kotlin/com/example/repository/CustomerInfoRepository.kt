package com.example.repository


import com.example.db.CustomerInfo
import com.example.digitalgold.CustomerInfoData
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

object CustomerInfoRepository {

    fun getAllCustomerInfo() :List<CustomerInfoData>{

        val data= transaction{
           return@transaction CustomerInfo.selectAll().mapNotNull { rowToCustomerInfo(it) }
        }

        return data

    }

    private fun rowToCustomerInfo(row: ResultRow?): CustomerInfoData? {
        if (row == null)
            return null
        return CustomerInfoData(
            id = row[CustomerInfo.id],
            customerHash = row[CustomerInfo.customerHash],
            firstName = row[CustomerInfo.firstName],
            lastName = row[CustomerInfo.lastName]
        )
    }
}