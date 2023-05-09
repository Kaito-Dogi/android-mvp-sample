package app.doggy.mvpsample.ui.count

import androidx.annotation.StringRes
import app.doggy.mvpsample.R
import app.doggy.mvpsample.domain.repository.CountRepository
import java.lang.IllegalStateException
import javax.inject.Inject

internal class CountPresenter @Inject constructor(
  private val view: CountContract.View,
  private val repository: CountRepository,
) : CountContract.Presenter {

  override fun onViewCreated() {
    val count = repository.getCount()
    view.showCount(count)
  }

  override fun onIncrementButtonClick() {
    val newCount = repository.incrementCount()
    view.showCount(newCount)
  }

  override fun onDecrementButtonClick() {
    runCatching {
      repository.decrementCount()
    }.onSuccess {
      view.showCount(it)
    }.onFailure {
      // TODO: エラーメッセージの通知方法を議論する
      @StringRes
      val message = when (it) {
        is IllegalStateException -> R.string.error_invalid_value
        else -> R.string.error_something_else
      }
      view.showError(message)
    }
  }
}
