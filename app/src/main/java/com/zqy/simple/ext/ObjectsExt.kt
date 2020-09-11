package com.zqy.simple.ext

/**
 * @author (zqy)
 * @datetime 2020-09-10 11:15 GMT+8
 * @email zqy789@126.com
 * @detail :
 */

fun checkNotNull(objects : Any?,errorMessage:Any?){
    if (objects == null){
        throw NullPointerException(errorMessage.toString())
    }
}

fun checkNotNull(objects : Any?){
    if (objects == null){
        throw NullPointerException()
    }
}