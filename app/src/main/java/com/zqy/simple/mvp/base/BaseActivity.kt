package com.zqy.simple.mvp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zqy.simple.mvp.IActivity
import com.zqy.simple.mvp.IPresenter

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:20 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
abstract class BaseActivity<P : IPresenter> : AppCompatActivity(), IActivity {


    protected var mPresenter: P? = getPresenter()

    open fun getPresenter(): P? {
        return null
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getRootView(savedInstanceState))
        onCreated(savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.onDestroy()
        mPresenter = null
    }

}