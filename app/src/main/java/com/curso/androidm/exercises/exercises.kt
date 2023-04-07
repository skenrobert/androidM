package com.curso.androidm.exercises

/** RESULT:
 - You have 61 notifications.
 - Your phone is blowing up! You have 99+ notifications.
 */

fun main() {
    val morningNotification = 61
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else{
        println("You have $numberOfMessages notifications.")
    }
}