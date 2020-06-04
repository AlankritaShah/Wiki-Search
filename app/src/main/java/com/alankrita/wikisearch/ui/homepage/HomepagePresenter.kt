package com.alankrita.wikisearch.ui.homepage

interface HomepagePresenter {
  fun setView(homepageView: HomepageView)

  fun loadHomepage(search : String)
}