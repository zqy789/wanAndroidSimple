package com.zqy.simple.http

import com.zqy.simple.mvp.template.LoginEntity
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * @author (zqy)
 * @datetime 2020-09-10 15:04 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
interface ApiService {

    @FormUrlEncoded
    @POST(API.LOGIN)
    fun login(@Field("username") userName: String, @Field("password") passWord: String): Call<BaseEntity<LoginEntity>>
    
    
    
}