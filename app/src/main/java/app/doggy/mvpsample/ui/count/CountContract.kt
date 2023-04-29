package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.ui.BasePresenter
import app.doggy.mvpsample.ui.BaseView

internal sealed interface CountContract {
  interface View : BaseView<Presenter> {
    fun showCount(count: Count)
  }

  interface Presenter : BasePresenter {
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
