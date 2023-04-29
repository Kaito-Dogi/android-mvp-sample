package app.doggy.mvpsample.data.repository

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.domain.repository.CountRepository
import javax.inject.Inject

class CountRepositoryImpl @Inject constructor() : CountRepository {
  private var count = Count()

  override fun getCount() = count

  override fun incrementCount() {
    val currentValue = count.value
    count = Count(currentValue + 1)
  }

  override fun decrementCount() {
    val currentValue = count.value
    count =
      if (currentValue > 0) Count(currentValue - 1)
      else Count()
  }
}
