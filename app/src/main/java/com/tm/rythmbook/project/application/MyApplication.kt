package com.tm.rythmbook.project.application

import android.app.Application
import com.tm.rythmbook.project.repo.MyRepository
import com.tm.rythmbook.project.repo.RepositoryImpl
import com.tm.rythmbook.project.viewmodel.MyViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule)
        }
    }

    val appModule = module {
        single<MyRepository> {RepositoryImpl()}
        viewModel { MyViewModel(get()) }
    }
}