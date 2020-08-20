package com.example.android.architecture.blueprints.todoapp.hilt.modules

import com.example.android.architecture.blueprints.todoapp.hilt.qualifiers.IoDispatcher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.Dispatchers

@InstallIn(ApplicationComponent::class)
@Module
object IoModule {
    @Provides
    @IoDispatcher
    fun provideIoDispatcher() = Dispatchers.IO
}