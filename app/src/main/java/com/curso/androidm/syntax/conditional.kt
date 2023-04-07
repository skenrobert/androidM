package com.curso.androidm

fun main() {
    ifMultipleOR()
    ifBasic()
    ifNested()
}

fun ifMultipleOR(){
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("Is it a cat or a dog")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("can i drink beer")
    }

}

fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Drink beer")
    }else{
        println("Drink juice")
    }
}

fun ifBoolean(){
    var ImHappy:Boolean = false

    //sin nada == true
    // con ! al principio == false

    if(!ImHappy){
        print("I'm sad :(")
    }
}

fun ifNested() {
    val animal = "robert"

    if (animal == "dog") {
        println("it's a puppy!")
    } else if (animal == "cat") {
        println("It is a cat")
    } else if (animal == "bird") {
        println("It is a bird")
    } else {
        println("Not one of the expected animals")
    }


}

fun ifBasic() {
    val name = "robert"

    if (name == "robert") {
        println("Hey, the name variable is $name")
    } else {
        println("this is not")
    }
}