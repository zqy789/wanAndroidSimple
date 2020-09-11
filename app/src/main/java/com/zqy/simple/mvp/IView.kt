package com.zqy.simple.mvp

/**
 * @author (zqy)
 * @datetime 2020-09-09 17:59 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
interface IView {

    fun showProgress(){}

    fun hideProgress(){}

    fun showMessage(message:String){}
}