package com.viktor.innap.didemoapp.di

import com.viktor.innap.didemoapp.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.Koin
import org.koin.core.module.Module
import org.koin.dsl.ModuleDeclaration
import org.koin.dsl.module


//Demo Purpose
object ModuleList {

    fun getMainModule() = module {
        factory { MainRepository(get()) }

        viewModel { MainViewModel(get()) }
    }

    fun getHttpModule() = module {
        single { DemoHttpService("") }
    }


    fun networkModuleByInteface() = module {
        single<IDemoHtttpService> { DemoHttpService(" some base url") }
    }
}


class MainRepository(private val remoteService: DemoHttpService) {

    fun loginUser(username: String, password: String): String {
        return remoteService.loginUserRemote(username, password)
    }
}


class DemoHttpService(baseUrl: String) : IDemoHtttpService  {
    //returns token
    override fun loginUserRemote(username: String, password: String): String =
        "auth_token_102301132"
}


interface IDemoHtttpService {
    fun loginUserRemote(username: String, password: String): String
}