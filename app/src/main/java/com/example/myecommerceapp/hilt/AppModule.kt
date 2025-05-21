package com.example.myecommerceapp.hilt

import com.example.myecommerceapp.data.FakeProductRepository
import com.example.myecommerceapp.data.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideProductRepository(): ProductRepository {
        return FakeProductRepository()
    }
}