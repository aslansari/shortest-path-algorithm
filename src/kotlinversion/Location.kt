package kotlinversion

import kotlin.math.abs

data class Location(val x: Int, val y: Int) {
    fun distanceBetween(location: Location): Int {
        return abs(x - location.x) + abs(y - location.y)
    }
}