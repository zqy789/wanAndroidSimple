package com.zqy.simple.mvp.template

import com.zqy.simple.http.BaseEntity
import com.zqy.simple.mvp.IModel
import com.zqy.simple.mvp.IView
import retrofit2.Call

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:42 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
interface LoginContract {

    interface LoginView : IView

    interface LoginModel :IModel {
        fun login(name: String, passWord: String): Call<BaseEntity<LoginEntity>>?

    }
}