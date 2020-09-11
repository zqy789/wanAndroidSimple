package com.zqy.simple.mvp

/**
 * @author (zqy)
 * @datetime 2020-09-10 11:00 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
interface IPresenter {

    fun start()

    /**
     * 内存释放操作
     */
    fun onDestroy()

}