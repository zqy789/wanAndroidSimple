package com.zqy.simple.http

import androidx.annotation.NonNull

interface IRepositoryManager {


    /**
     * 根据传入的 Class 获取对应的 Retrofit service
     *
     * @param service Retrofit service class
     * @param <T>     Retrofit service 类型
     * @return Retrofit service
     */
    @NonNull
    fun <T> obtainRetrofitService(@NonNull service: Class<T>): T


    /**
     * 根据传入的 Class 获取对应的 RxCache service
     *
     * @param cache RxCache service class
     * @param <T>   RxCache service 类型
     * @return RxCache service
    </T> */
    fun <T> obtainCacheService(cache: Class<T>): T?

    fun cancel()
}
