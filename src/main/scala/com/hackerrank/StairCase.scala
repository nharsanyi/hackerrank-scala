package com.hackerrank

object StairCase {

  def staircase(n: Int) {
    for (i <- 0 to n - 1) {
      for (j <- 0 to n - i - 2) {
        print(" ")
      }
      for (j <- 0 to i) {
        print("#")
      }
      println()
    }
  }

}
