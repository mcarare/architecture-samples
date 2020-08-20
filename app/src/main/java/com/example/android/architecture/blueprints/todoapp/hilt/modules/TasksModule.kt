package com.example.android.architecture.blueprints.todoapp.hilt.modules

import com.example.android.architecture.blueprints.todoapp.data.source.DefaultTasksRepository
import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
import com.example.android.architecture.blueprints.todoapp.hilt.qualifiers.IoDispatcher
import com.example.android.architecture.blueprints.todoapp.hilt.qualifiers.LocalTasksDataSource
import com.example.android.architecture.blueprints.todoapp.hilt.qualifiers.RemoteTasksDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object TasksModule {

    @Singleton
    @Provides
    fun provideTasksRepository(
        @RemoteTasksDataSource remoteTasksDataSource: TasksDataSource,
        @LocalTasksDataSource localTasksDataSource: TasksDataSource,
        @IoDispatcher ioDispatcher: CoroutineDispatcher
    ): TasksRepository =
        DefaultTasksRepository(
            remoteTasksDataSource, localTasksDataSource, ioDispatcher
        )
}
