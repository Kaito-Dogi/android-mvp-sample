package app.doggy.mvpsample.data

import app.doggy.mvpsample.data.repository.CountRepositoryImpl
import app.doggy.mvpsample.domain.repository.CountRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {

  @Binds
  fun bindCountRepository(impl: CountRepositoryImpl): CountRepository
}
