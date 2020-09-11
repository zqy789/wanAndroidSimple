package com.zqy.simple.http

import retrofit2.Converter

/**
 * @author (zqy)
 * @datetime 2020-09-10 15:09 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
class BaseEntity<T> {
    /**
     * {
    "data": ...,
    "errorCode": 0, {}
    "errorMsg": ""
    }
    所有的返回结构均为上述，其中errorCode如果为负数则认为错误，此时errorMsg会包含错误信息。data为Object，返回数据根据不同的接口而变化。

    errorCode = 0 代表执行成功，不建议依赖任何非0的 errorCode.
    errorCode = -1001 代表登录失效，需要重新登录。
     */
    companion object {
        const val TOKEN_FAILURE = -1001
        const val ERROR = -1
        const val SUCCESS = 0
    }

    val data: T? = null

    private val errorCode: Int = -1

    var errorMessage: String? = null

    /**
     * 需要登陆的时候也算是
     */
    fun isSuccess() = errorCode == SUCCESS

}