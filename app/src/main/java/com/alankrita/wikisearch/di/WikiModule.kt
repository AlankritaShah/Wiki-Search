package com.alankrita.wikisearch.di

import com.alankrita.wikisearch.network.Homepage
import com.alankrita.wikisearch.network.Wiki
import com.alankrita.wikisearch.network.WikiApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WikiModule {
    @Provides
    @Singleton
    fun provideHomePage(api: WikiApi) = Homepage(api)

    @Provides
    @Singleton
    fun provideWiki(api: WikiApi) = Wiki(api)
}