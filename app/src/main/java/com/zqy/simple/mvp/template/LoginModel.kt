package com.zqy.simple.mvp.template

import com.zqy.simple.http.ApiService
import com.zqy.simple.http.BaseEntity
import com.zqy.simple.mvp.BaseModel
import com.zqy.simple.http.IRepositoryManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:51 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
class LoginModel(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager),LoginContract.LoginModel {

    override fun login(name: String, passWord: String): Call<BaseEntity<LoginEntity>>? {
       return repositoryManager?.obtainRetrofitService(ApiService::class.java)?.login(name,passWord)

    }


}