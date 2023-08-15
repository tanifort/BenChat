package com.example.benchat

import android.content.Context
import com.example.benchat.infrastructure.dataAccess.sharedPreference.DataStoreManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton




@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun providePreferenceDataStore (@ApplicationContext appContext: Context): DataStoreManager {
        return DataStoreManager(appContext)
    }


}