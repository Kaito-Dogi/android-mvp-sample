package app.doggy.mvpsample.ui.count

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
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
@InstallIn(FragmentComponent::class)
internal object CountFragmentModule {

  @Provides
  fun provideCountFragment(fragment: Fragment) = fragment as CountFragment
}
