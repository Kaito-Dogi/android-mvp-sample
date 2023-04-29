package app.doggy.mvpsample.domain.repository

interface CountRepository {
  fun getCount()
  fun incrementCount()
  fun decrementCount()
}
