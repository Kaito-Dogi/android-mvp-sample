package app.doggy.mvpsample.ui

/**
 * View で Presenter を DI し忘れることを防ぐ
 */
interface BaseView<T> {
  val presenter: T
}
