package com.curso.androidm.galleryapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,// retrieve response from api
    @SerializedName("results") val superheroes: List<SuperheroItemResponse> // Here is the data of this api, in others it is normally data:
)

data class SuperheroItemResponse( // format the data you receive in results above
    @SerializedName("id") val superheroId: String, //(results.id: '')
    @SerializedName("name") val name: String, //(results.name: '')
    @SerializedName("image") val superheroImage:SuperheroImageResponse //name below because the route is different, you make all in one object
)

data class SuperheroImageResponse(@SerializedName("url") val url:String)// the url of the image, an object is created if it is not in the same child of the json (results.image.url: '')