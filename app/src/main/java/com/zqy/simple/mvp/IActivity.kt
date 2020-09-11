package com.zqy.simple.mvp

import android.os.Bundle
import androidx.annotation.LayoutRes

/**
 * @author (zqy)
 * @datetime 2020-09-10 13:35 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
interface IActivity {

    @LayoutRes
    fun getRootView(savedInstanceState: Bundle?) : Int


    fun onCreated(savedInstanceState: Bundle?)
}