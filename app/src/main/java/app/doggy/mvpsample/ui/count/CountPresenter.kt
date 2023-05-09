package app.doggy.mvpsample.ui.count

import app.doggy.mvpsample.domain.repository.CountRepository
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
      view.showError(it.message ?: "an error has occurred")
    }
  }
}
