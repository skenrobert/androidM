package com.curso.androidm.syntax

fun main() {

    //I ~ 0-6
    //Size 7
    val weekDays = arrayOf("Monday", "tuesday", "Wednesday", "thursday", "friday", "saturday", "sunday")

//    println(weekDays[0])
//    println(weekDays.size)

    //sizes
    if (weekDays.size >= 8) {
//        println(weekDays[7])
    } else {
//        println("There are no more values in the array")
    }

    //modify values
    weekDays[0] = "Happy Monday"
//    println(weekDays[0])


    //Loops for Arrays
    for(position in weekDays.indices){
//       println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
//        println("The position $position, contains $value")
    }

    for (day in weekDays){
        println("Is now $day")
    }

    weekDays.forEach { it }
}