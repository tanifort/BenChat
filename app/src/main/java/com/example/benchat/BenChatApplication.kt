package com.example.benchat

import android.app.Application
import com.parse.Parse
import dagger.hilt.android.HiltAndroidApp
import okhttp3.OkHttpClient


@HiltAndroidApp
class BenChatApplication : Application(){
    override fun onCreate() {
        super.onCreate()

    /**
     *
     * val okHttpClient = OkHttpClient.Builder()
    .build()
    Parse.initialize(
    Parse.Configuration.Builder(this)
    .applicationId(getString(R.string.back4app_app_id))
    .clientKey(getString(R.string.back4app_client_key))
    .server(getString(R.string.back4app_server_url))
    .build());
     *
     * */

        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build());

    }

}