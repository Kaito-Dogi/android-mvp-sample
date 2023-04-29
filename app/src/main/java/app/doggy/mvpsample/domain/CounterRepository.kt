package app.doggy.mvpsample.domain

interface CountRepository {
  fun getCount()
  fun incrementCount()
  fun decrementCount()
}
