package app.doggy.mvpsample.ui.count

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import app.doggy.mvpsample.R
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
internal interface CountModule {

  @Binds
  fun bindView(impl: CountFragment): CountContract.View

  @Binds
  fun bindPresenter(impl: CountPresenter): CountContract.Presenter
}

// TODO: 従来の MVP アーキテクチャの実装をもとに CountFragment の DI 方法を議論する
@Module
@InstallIn(ActivityComponent::class)
internal object CountFragmentModule {

  @Provides
  fun provideCountFragment(activity: Activity) =
    (activity as AppCompatActivity).supportFragmentManager.findFragmentById(R.id.container) as CountFragment
}
