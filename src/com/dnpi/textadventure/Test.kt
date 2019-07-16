package com.dnpi.textadventure

fun main(args: Array<String>) {
    val locations = readLocationInfo()
    var loc = 64

    while(true) {
        val location = locations[loc] ?: Location(0,"Sorry somewthing went wrong, so the game will terminate")

        println(location.description)

        if(location.locationId == 0) {
            break
        }

        print("Available exits are: ")
        location.exits.keys.forEach{
            print("$it")
        }

        val direction = readLine()?.toUpperCase() ?: "Z"
        if(location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!
        }

        else {
            print("You cannot go into that direction")
        }
    }
}

fun area(width: Int, height: Int) {
    println("$width and $height")
}