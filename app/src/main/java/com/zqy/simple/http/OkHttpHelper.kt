package com.zqy.simple.http

import com.zqy.simple.http.cookie.CookieJarImpl
import com.zqy.simple.http.cookie.store.CookieStore
import com.zqy.simple.http.cookie.store.MemoryCookieStore
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * @author (zqy)
 * @datetime 2020-09-10 14:35 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
object OkHttpHelper {
    private const val TIME_OUT = 10L

    fun getOkHttpClient() = OkHttpClient.Builder()
        .cookieJar(CookieJarImpl(MemoryCookieStore()))
        .addInterceptor(HttpLogInterceptor())
        .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
        .readTimeout(TIME_OUT, TimeUnit.SECONDS)
        .build()
}