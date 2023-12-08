package com.arthur.myapplication.koinmodules

import com.arthur.myapplication.api.RickMorthAPI
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val serverModule = module {

    single<Retrofit>{
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(
                GsonConverterFactory.create())
                .build()
    }

    single<RickMorthAPI> {
        get<Retrofit>().create(RickMorthAPI::class.java)
    }
}