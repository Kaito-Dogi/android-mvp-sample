package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.ui.BasePresenter
import app.doggy.mvpsample.ui.BaseView

internal interface CountContract {

  interface View : BaseView<Presenter> {
    fun showCount(count: Count)
    fun showError(message: String)
  }

  interface Presenter : BasePresenter {
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
