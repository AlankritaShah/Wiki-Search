package com.alankrita.wikisearch.network

import com.alankrita.wikisearch.utils.Const
import okhttp3.Call
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import javax.inject.Inject

class WikiApi @Inject constructor(private val client: OkHttpClient, requestBuilder: HttpUrl.Builder?) {

  fun search(query: String): Call {
    val urlBuilder = HttpUrl.parse("${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}")?.newBuilder()
        ?.addQueryParameter("action", "query")
        ?.addQueryParameter("list", "search")
        ?.addQueryParameter("format", "json")
        ?.addQueryParameter("srsearch", query)

    return Request.Builder()
        .url(urlBuilder?.build())
        .get()
        .build()
        .let {
          client.newCall(it)
        }
  }

  fun getHomepage(search : String): Call {
    val urlBuilder = HttpUrl.parse("${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}")?.newBuilder()
        ?.addQueryParameter("action", "parse")
        ?.addQueryParameter("page", search)
        ?.addQueryParameter("format", "json")

    return Request.Builder()
        .url(urlBuilder?.build())
        .get()
        .build()
        .let {
          client.newCall(it)
        }
  }
}