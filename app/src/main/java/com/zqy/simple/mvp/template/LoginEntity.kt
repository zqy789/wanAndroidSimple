package com.zqy.simple.mvp.template

/**
 * @author (zqy)
 * @datetime 2020-09-10 15:17 GMT+8
 * @email zqy789@126.com
 * @detail :
 */
data class LoginEntity(
    val admin: Boolean,
    val chapterTops: List<Any>,
    val coinCount: Int,
    val collectIds: List<Any>,
    val email: String,
    val icon: String,
    val id: Int,
    val nickname: String,
    val password: String,
    val publicName: String,
    val token: String,
    val type: Int,
    val username: String
)