package com.alankrita.wikisearch.di

import com.alankrita.wikisearch.ui.homepage.HomepageActivity
import com.alankrita.wikisearch.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class, NetworkModule::class, WikiModule::class])
interface AppComponent{
    fun inject(target: HomepageActivity)
    fun inject(target: SearchActivity)
}