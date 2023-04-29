package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.repository.CountRepository
import javax.inject.Inject

internal class CountPresenter @Inject constructor(
  private val view: CountContract.View,
  private val repository: CountRepository,
) : CountContract.Presenter {

  override fun onViewCreated() {
    showCount()
  }

  override fun onIncrementButtonClick() {
    repository.incrementCount()
    showCount()
  }

  override fun onDecrementButtonClick() {
    runCatching {
      repository.decrementCount()
    }.onSuccess {
      showCount()
    }.onFailure {
      view.showError(it.message ?: "an error has occurred")
    }
  }

  private fun showCount() {
    val count = repository.getCount()
    view.showCount(count)
  }
}
