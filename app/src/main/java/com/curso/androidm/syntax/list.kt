package com.curso.androidm.syntax

fun main(){
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")
    weekDays.add(3,"robert")
    println(weekDays)

    if(weekDays.isEmpty()){
        //I'm not going to paint anything because there isn't
    }else{
        weekDays.forEach { println(it) } // loop list
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }// loop list
    }

    weekDays.last()

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

//    Filtrar
    val example = readOnly.filter { it.contains("a")  } // loop list and search char 'a'
    println(example)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) } // loop list
}