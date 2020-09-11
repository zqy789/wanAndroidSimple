package com.zqy.simple.mvp

/**
 * @author (zqy)
 * @datetime 2020-09-10 11:01 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
open class BasePresenter<M : IModel, V : IView>(model: M?, view: V?) : IPresenter {

    protected var mRootView: V? = requireNotNull(view) { "rootView  is null: $this" }
    protected var mModel: M? = requireNotNull(model) { "model  is null: $this" }

    init {
        start()
    }

    override fun start() {

    }

    override fun onDestroy() {
        mModel?.onDestroy()
        mModel = null
        mRootView = null
    }
}