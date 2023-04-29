package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.ui.BasePresenter
import app.doggy.mvpsample.ui.BaseView

/**
 * View, Presenter 以外に継承されることを防ぐため sealed interface にした
 */
internal sealed interface CountContract {
  interface View : BaseView<Presenter> {
    fun showCount(count: Count)
  }

  interface Presenter : BasePresenter {
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
