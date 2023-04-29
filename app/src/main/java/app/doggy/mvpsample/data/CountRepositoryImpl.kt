package app.doggy.mvpsample.data

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.domain.repository.CountRepository

class CountRepositoryImpl : CountRepository {
  private var count = Count()

  override fun getCount() = count

  override fun incrementCount() {
    val currentValue = count.value
    count = Count(currentValue + 1)
  }

  override fun decrementCount() {
    val currentValue = count.value
    count = Count(currentValue - 1)
  }
}
