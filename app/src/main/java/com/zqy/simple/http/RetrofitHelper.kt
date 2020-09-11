package com.zqy.simple.http

import com.zqy.simple.http.API
import com.zqy.simple.http.OkHttpHelper
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author (zqy)
 * @datetime 2020-09-10 14:33 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
object RetrofitHelper {


    fun getRetrofit():Retrofit = Retrofit.Builder()
        .baseUrl(API.BASE_URL)
        .client(OkHttpHelper.getOkHttpClient())
        // FIXME: 2020/9/10 add Adapter
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}