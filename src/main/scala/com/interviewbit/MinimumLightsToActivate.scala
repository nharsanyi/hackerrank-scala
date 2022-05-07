package com.interviewbit

import scala.util.control.Breaks._

object MinimumLightsToActivate {

  def solve(A: Array[Int], B: Int): Int  = {
    val n = A.length
    var i = 0
    var count = 0
    while (i < n) {
      var isBulbLighted = false
      val startIndex = Math.max(i - B + 1, 0)
      val endIndex = Math.min(i + B - 1, n - 1)
      breakable {
        for (j <- endIndex to startIndex by -1) { // go backwards within the range
          if (A(j) == 1) {
            // found a bulb
            count += 1
            i = j
            i += B // skip the next B element, because they are already covered by the current bulb
            isBulbLighted = true
            break

          }
        }
      }
      if (!isBulbLighted) return -1
    }
    count
  }

}
