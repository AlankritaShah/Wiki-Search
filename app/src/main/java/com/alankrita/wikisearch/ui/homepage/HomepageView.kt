package com.alankrita.wikisearch.ui.homepage

import com.alankrita.wikisearch.data.WikiHomepage

interface HomepageView {
  fun displayLoading()

  fun dismissLoading()

  fun displayHomepage(result: WikiHomepage)

  fun displayError(error: String?)
}