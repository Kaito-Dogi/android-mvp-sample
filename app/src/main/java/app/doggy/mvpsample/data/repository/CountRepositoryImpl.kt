package app.doggy.mvpsample.data.repository

import app.doggy.mvpsample.domain.model.Count
import app.doggy.mvpsample.domain.repository.CountRepository
import javax.inject.Inject

internal class CountRepositoryImpl @Inject constructor() : CountRepository {
  private var count = Count()

  override fun getCount() = count

  override fun incrementCount(): Count {
    val currentValue = count.value
    count = Count(currentValue + 1)
    return count
  }

  override fun decrementCount(): Count {
    val currentValue = count.value
    count = Count(currentValue - 1)
    return count
  }
}
