package com.example.digitalgold

import java.time.LocalTime
import java.util.UUID


fun dataGenerator(customerInfo:CustomerInfoData,eventId:UUID=UUID.randomUUID()):DG{

    val dgData= DG("digigold_goldback",
        "$eventId",
        System.currentTimeMillis(),
        DT(
            CustomerDetails(
                customerInfo.customerHash,
                customerInfo.firstName,
                customerInfo.lastName,
                13444,
                99999944
            ),
            OfferDetails(
                54,
                "grams or rs",
                "EMI- Digital Gold Goldback Offer",
                4444,
                "BigBasket",
                9999999,
                232323,
                3333
            )
        )
    )


    return dgData
}