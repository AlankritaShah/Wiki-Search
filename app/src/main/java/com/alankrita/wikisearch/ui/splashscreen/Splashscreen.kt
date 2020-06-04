package com.alankrita.wikisearch.ui.splashscreen

import android.app.Activity
import android.os.Bundle
import com.alankrita.wikisearch.ui.homepage.HomepageActivity
import com.alankrita.wikisearch.utils.start

class Splashscreen : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    HomepageActivity::class.start(this, true)
  }
}