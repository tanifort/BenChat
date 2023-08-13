package com.example.benchat

import android.app.Application
import com.example.benchat.domain.interfaces.IAuthenticationService
import com.example.benchat.domain.services.AuthenticationService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn

@Module
@InstallIn(Application::class)
abstract class ApplicationModule {
    //(a) Provide interfaces with @Binds
//(b) Provide not owned Instance with @Provide ( instances from external libs, for instance)
    @Binds
    abstract fun bindAuthenticationService(authenticationService: AuthenticationService): IAuthenticationService
}