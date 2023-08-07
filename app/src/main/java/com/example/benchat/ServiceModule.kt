package com.example.benchat

import com.parse.Parse
import com.parse.ParseObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {



    //example (b) provide the Parse Object to all parts of the application should be done using (b) or @Provide
    @Provides
    fun provideParseObject(
        @ActivityContext app: BenChatApplication
    ) {
        Parse.initialize(
            Parse.Configuration.Builder(app)
                .applicationId(app.getString(R.string.back4app_app_id))
                .clientKey(app.getString(R.string.back4app_client_key))
                .server(app.getString(R.string.back4app_server_url))
                .build()
        )


    }


}