package com.alankrita.wikisearch

import android.app.Application
import com.alankrita.wikisearch.di.AppComponent
import com.alankrita.wikisearch.di.AppModule
import com.alankrita.wikisearch.di.DaggerAppComponent

class WikiApplication : Application() {
  lateinit var wikiComponent: AppComponent

  override fun onCreate() {
    super.onCreate()

    wikiComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
  }
}