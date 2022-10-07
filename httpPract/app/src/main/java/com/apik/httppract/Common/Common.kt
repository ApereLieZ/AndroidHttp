package com.apik.httppract.Common

import com.apik.httppract.Retrofit.RetrofitClient
import com.apik.httppract.`interface`.RetrofitServices

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}