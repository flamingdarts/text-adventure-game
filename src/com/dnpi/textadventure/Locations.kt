package com.dnpi.textadventure

import java.io.File

fun readLocationInfo() : Map<Int, Location> {
    val locations = mutableMapOf<Int, Location>()

    File("location_big.txt").reader().forEachLine {
        val token = it.split("`")

        val location = Location(token[0].toInt(), token[1])
        locations[location.locationId] = location
    }

    File("directions_big.txt").reader().forEachLine {
        val token = it.split(",")

        locations[token[0].toInt()]?.addExits(token[1],token[2].toInt())
    }
    return locations
}