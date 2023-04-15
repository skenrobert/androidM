package com.curso.androidm.galleryapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

public interface ApiService {//only call api

    @GET("/api/1880025192382288/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/1880025192382288/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response<SuperHeroDetailResponse>
// suspend is for call asynchronous
}