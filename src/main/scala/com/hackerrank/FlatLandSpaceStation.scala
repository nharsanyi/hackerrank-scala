package com.hackerrank

object FlatLandSpaceStation {

  def flatlandSpaceStations(n: Int, c: Array[Int]): Int = {
    val m = c.length
    var currMax = 0

    for (city <- 0 to n - 1) {
      var minDistance = Int.MaxValue
      for (j <- 0 to m - 1) {
        val station = c(j)
        val d = math.abs(station - city)
        minDistance = math.min(d, minDistance)
      }
      currMax = math.max(currMax, minDistance)
    }
    currMax
  }
}
