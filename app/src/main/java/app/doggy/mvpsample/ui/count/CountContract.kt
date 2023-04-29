package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.ui.BaseView

sealed interface CountContract {
  interface View : BaseView<Presenter> {
    fun showCount(count: Count)
  }

  interface Presenter {
    fun onViewCreated()
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
