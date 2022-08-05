package com.example.digitalgold
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalTime

@Serializable
data class DG(
    val eventType:String,
    val eventId:String,
    val timeStamp: Long,
    val data:DT
)


@Serializable
data class DT( val customerDetails: CustomerDetails,
               val offerDetails: OfferDetails

)

@Serializable
data class CustomerInfoData(val id:Int,
    val customerHash:String,
                           val firstName:String,
                           val lastName:String,
)

@Serializable
data class CustomerDetails(val customerHash:String,
                           val firstName:String,
                           val lastName:String,
                           val pincode:Int,
                           val mobile:Int
)

@Serializable
data class OfferDetails(val offerValue:Int,
                        val unitOfMeasure:String,
                        val offerName:String,
                        val merchantId: Int,
                        val merchantName:String,
                        val transactionId:Int,
                        val orderId:Int,
                        val offerId:Int
)

