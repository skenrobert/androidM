package com.curso.androidm

fun main(){
    var name:String? = null  //handling exception with (?), avoid breaking your app

    println(name?.get(3) ?:  "is null")
}