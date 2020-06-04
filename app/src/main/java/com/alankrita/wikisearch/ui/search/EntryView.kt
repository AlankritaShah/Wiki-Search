package com.alankrita.wikisearch.ui.search

import com.alankrita.wikisearch.data.Entry

interface EntryView {
  fun displayLoading()

  fun dismissLoading()

  fun displayEntries(results: List<Entry>)

  fun displayError(error: String?)
}