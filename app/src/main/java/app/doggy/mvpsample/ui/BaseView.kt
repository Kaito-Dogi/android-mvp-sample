package app.doggy.mvpsample.ui

/**
 * View で Presenter を DI し忘れることを防ぐため presenter を定義した
 */
internal interface BaseView<T> {
  val presenter: T
}
