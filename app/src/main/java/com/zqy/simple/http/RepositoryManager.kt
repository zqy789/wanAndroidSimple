package com.zqy.simple.http

/**
 * @author (zqy)
 * @datetime 2020-09-10 14:03 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
class RepositoryManager : IRepositoryManager {


    override fun <T> obtainRetrofitService(service: Class<T>): T {
        return RetrofitHelper.getRetrofit()
            .create(service)
    }

    override fun <T> obtainCacheService(cache: Class<T>): T? {
        return null
    }

    override fun cancel() {
    }
}