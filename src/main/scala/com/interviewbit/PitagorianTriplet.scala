package com.interviewbit

object PitagorianTriplet {

  def solve(A: Int): Int  = {
    var res = 0
    for (a <- 1 to A) {
      for (b <- 1 to a) {
        val c2 = Math.pow(a, 2) + Math.pow(b, 2)
        val sqrt = Math.sqrt(c2).toInt
        if (sqrt <= A && sqrt * sqrt == c2) {
          res += 1
        }
      }
    }
    res
  }
}
