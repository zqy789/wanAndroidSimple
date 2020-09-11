package com.zqy.simple.http.cookie

import com.zqy.simple.http.cookie.store.CookieStore
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import java.lang.NullPointerException


/**
 * @author (zqy)
 * @datetime 2020-09-10 16:57 GMT+8
 * @email zqy789@126.com
 * @detail : 使用泓洋大佬写的
 * @link https://sourcegraph.com/github.com/hongyangAndroid/okhttputils/-/blob/okhttputils/src/main/java/com/zhy/http/okhttp/cookie/CookieJarImpl.java#L19
 */
class CookieJarImpl(private var cookieStore: CookieStore?) : CookieJar {

    init {
        if (cookieStore == null) throw NullPointerException("cookieStore can not be null.")
    }

    fun getCookieStore(): CookieStore? {
        return cookieStore
    }

    @Synchronized
    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        return cookieStore?.get(url)!!
    }

    @Synchronized
    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
        cookieStore?.add(url, cookies)
    }
}