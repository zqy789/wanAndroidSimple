package com.zqy.simple.mvp

import com.zqy.simple.http.IRepositoryManager

/**
 * @author (zqy)
 * @datetime 2020-09-10 11:02 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
open class BaseModel constructor(protected var repositoryManager: IRepositoryManager?) : IModel {


    override fun onDestroy() {
        repositoryManager = null
    }
}