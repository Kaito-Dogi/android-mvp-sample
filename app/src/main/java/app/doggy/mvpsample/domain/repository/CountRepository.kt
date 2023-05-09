package app.doggy.mvpsample.domain.repository

import app.doggy.mvpsample.domain.model.Count

interface CountRepository {
  fun getCount(): Count
  fun incrementCount(): Count
  fun decrementCount(): Count
}
