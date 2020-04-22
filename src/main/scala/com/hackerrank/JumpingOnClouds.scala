package com.hackerrank

object JumpingOnClouds {

  def jumpingOnClouds(c: Array[Int]): Int = {
    val n = c.length
    var jumps: Int = -1
    var i: Int = 0

    while (i < n) {
      if (i < n - 2 && c(i + 2) == 0) { // try jump 2 if possible
        i += 2
      } else {
        i += 1
      }
      jumps += 1
    }
    jumps

  }

}
