package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.model.Count

sealed interface CountContract {
  interface View {
    fun showCount(count: Count)
  }

  interface Presenter {
    fun onCreate()
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
