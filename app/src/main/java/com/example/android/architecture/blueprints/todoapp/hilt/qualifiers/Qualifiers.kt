package com.example.android.architecture.blueprints.todoapp.hilt.qualifiers

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class IoDispatcher

@Qualifier
@Retention(RUNTIME)
annotation class LocalTasksDataSource

@Qualifier
@Retention(RUNTIME)
annotation class RemoteTasksDataSource