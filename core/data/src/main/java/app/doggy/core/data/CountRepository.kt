package app.doggy.core.data

interface CountRepository {
  fun getCount()
  fun incrementCount()
  fun decrementCount()
}
