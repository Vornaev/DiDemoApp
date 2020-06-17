package com.viktor.innap.didemoapp.di

import android.util.Log
import org.koin.dsl.bind
import org.koin.dsl.module
import java.io.Console
import java.io.Writer

object ModuleDef {

    class User()
    class Profile(val user: User)

    val profileModule = module {
        factory { Profile(get()) } //resolve dependency }
    }

    val userModule = module {
        factory { User() }
    }


    interface IService {
        fun hi()
    }

    class ServiceImp : IService {
        override fun hi() {
        }
    }

    val serviceModule = module {
        single<IService> { ServiceImp() }
    }

    val serviceModule2 = module {
        single { ServiceImp() } bind IService::class
    }

}
