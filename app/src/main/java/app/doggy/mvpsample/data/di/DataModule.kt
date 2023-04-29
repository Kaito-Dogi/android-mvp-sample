package app.doggy.mvpsample.data.di

import app.doggy.mvpsample.data.repository.CountRepositoryImpl
import app.doggy.mvpsample.domain.repository.CountRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

  @Binds
  fun bindsCountRepository(impl: CountRepositoryImpl): CountRepository
}
