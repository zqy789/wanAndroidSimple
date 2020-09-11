package com.zqy.simple.mvp.template

import android.os.Bundle
import com.zqy.simple.R
import com.zqy.simple.ext.showToast
import com.zqy.simple.mvp.base.BaseActivity
import com.zqy.simple.http.RepositoryManager
import kotlinx.android.synthetic.main.login_activity.*

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:49 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
class LoginActivity :BaseActivity<LoginPresenter>(),LoginContract.LoginView {

    override fun getPresenter(): LoginPresenter? {
        return LoginPresenter(LoginModel(RepositoryManager()),this)
    }

    override fun getRootView(savedInstanceState: Bundle?): Int {
        return R.layout.login_activity
    }

    override fun onCreated(savedInstanceState: Bundle?) {

        from_login.setOnClickListener{
            val name = "zqy789@126.com"
            val passWord = "wanpass123"

            mPresenter?.login(name,passWord)
        }
    }


    override fun showMessage(message: String) {
        super.showMessage(message)
        showToast(message)
    }
}