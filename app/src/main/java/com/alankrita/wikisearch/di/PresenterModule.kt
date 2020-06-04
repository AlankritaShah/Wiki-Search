package com.alankrita.wikisearch.di

import com.alankrita.wikisearch.network.Homepage
import com.alankrita.wikisearch.network.Wiki
import com.alankrita.wikisearch.ui.homepage.HomepagePresenter
import com.alankrita.wikisearch.ui.homepage.HomepagePresenterImpl
import com.alankrita.wikisearch.ui.search.EntryPresenter
import com.alankrita.wikisearch.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Singleton
    @Provides
    fun provideHomepagePresenter(homepage: Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

    @Singleton
    @Provides
    fun provideEntryPresenter(wiki: Wiki): EntryPresenter = EntryPresenterImpl(wiki)
}