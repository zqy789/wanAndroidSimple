package com.zqy.simple.mvp.template

import com.zqy.simple.ext.logd
import com.zqy.simple.ext.loge
import com.zqy.simple.http.BaseEntity
import com.zqy.simple.mvp.BasePresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:50 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
class LoginPresenter(model: LoginContract.LoginModel, view: LoginContract.LoginView) :
    BasePresenter<LoginContract.LoginModel, LoginContract.LoginView>(model, view) {

    fun login(name: String, passWord: String) {
        if (name.isNotEmpty()) {
            mRootView?.showMessage("账号不能为空")
        }
        if (passWord.isNotEmpty()) {
            mRootView?.showMessage("密码不能为空")
        }

        mModel?.login(name, passWord)?.enqueue(object : Callback<BaseEntity<LoginEntity>> {
            override fun onFailure(call: Call<BaseEntity<LoginEntity>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<BaseEntity<LoginEntity>>,
                response: Response<BaseEntity<LoginEntity>>
            ) {

            }


        })
    }


}