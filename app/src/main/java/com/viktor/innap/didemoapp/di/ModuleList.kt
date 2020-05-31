package com.viktor.innap.didemoapp.di

import org.koin.core.Koin
import org.koin.core.module.Module
import org.koin.dsl.ModuleDeclaration
import org.koin.dsl.module


//Demo Purpose
object ModuleList {

    fun getMainModule() = module {
        factory { MainRepository(get()) }
    }

    fun getHttpModule() = module {
        single { DemoHttpService() }
    }
}

class MainRepository(private val mainService: DemoHttpService) {
    fun loginUser(username: String, password: String): String {
        return mainService.loginUserRemote(username, password)
    }
}


class DemoHttpService {
    //returns token
    fun loginUserRemote(username: String, password: String): String =
        "bearer_otpqwkeowqekpmcopawqpiewqe"
}