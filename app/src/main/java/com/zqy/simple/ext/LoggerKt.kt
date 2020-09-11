package com.zqy.simple.ext

import android.util.Log
import com.zqy.simple.BuildConfig

/**
 * @author (zqy)
 * @datetime 2020-09-10 15:27 GMT+8
 * @email zqy789@126.com
 * @detail :
 */

fun logd(tag:String,message:String){
    if (BuildConfig.DEBUG){
        Log.d(tag,message)
    }
}

fun loge(tag:String,message:String){
    if (BuildConfig.DEBUG){
        Log.e(tag,message)
    }
}