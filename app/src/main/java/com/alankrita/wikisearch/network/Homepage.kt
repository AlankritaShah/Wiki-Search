package com.alankrita.wikisearch.network

class Homepage(private val api: WikiApi) {
  fun get(search : String) = api.getHomepage(search)
}