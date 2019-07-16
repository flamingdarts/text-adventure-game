package com.dnpi.textadventure

data class Location(val locationId: Int, val description: String) {

    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExits(direction: String, destinationId: Int) {
        exits[direction] = destinationId
    }
}