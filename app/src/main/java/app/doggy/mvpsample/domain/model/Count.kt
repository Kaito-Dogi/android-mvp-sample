package app.doggy.mvpsample.domain.model

@JvmInline
value class Count(val value: Int = 0) {
  init {
    require(value >= 0) { "value must be greater than or equal to 0" }
  }
}
