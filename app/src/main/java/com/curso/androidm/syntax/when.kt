package com.curso.androidm

fun main(){
    getSemester(10)
    getTrimester(2)
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("hey")
    }
}

fun getSemester(month: Int) = when(month){// return implicit
    in 1..6 ->  println("First semester")
    in 7..12 ->   println("second semester")
    !in 1..12 -> println("invalid semester")
    else ->  println("nothing")
}


fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> print("First trimester")
        4, 5, 6 -> print("second trimester")
        7, 8, 9 -> print("Third trimester")
        10, 11, 12 -> print("Fourth trimester")
        else -> print("Invalid trimester")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> print("January")
        2 -> print("February")
        3 -> print("Marz")
        4 -> print("April")
        5 -> print("May")
        6 -> print("Juny")
        7 -> print("July")
        8 -> print("Agust")
        9 -> print("Septembre")
        10 -> print("October")
        11 -> {
            print("November")
            print("two line")
        }
        12 -> print("Dicember")
        else -> print("Not a valid month")
    }
}