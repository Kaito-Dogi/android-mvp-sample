package app.doggy.mvpsample.ui.count

import androidx.annotation.StringRes
import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.ui.BasePresenter
import app.doggy.mvpsample.ui.BaseView

internal interface CountContract {

  interface View : BaseView<Presenter> {
    fun showCount(count: Count)
    fun showError(@StringRes errorMessageRes: Int)
  }

  interface Presenter : BasePresenter {
    fun onIncrementButtonClick()
    fun onDecrementButtonClick()
  }
}
