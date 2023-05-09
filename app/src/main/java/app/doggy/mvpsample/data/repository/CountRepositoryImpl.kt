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
    // ドメイン上の制約（Count は0以上）のため、0未満になる場合に例外を投げる
    if (count.value == 0) throw IllegalStateException()

    val currentValue = count.value
    count = Count(currentValue - 1)
    return count
  }
}
