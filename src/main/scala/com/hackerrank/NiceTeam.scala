package com.hackerrank

object NiceTeam {

  def maxPairs(skillLevel: Array[Int], minDiff: Int): Int = {
    val arr = skillLevel.sorted
    val n = arr.size - 1
    var count: Int = 0
    var pos = 1
    for (i <- 0 to n) {
      val curr = arr(i)
      var j = n
      while (j >= pos && (arr(j) - curr) >= minDiff)  {
        j -= 1
      }
      if (j == n) {
        // we couldn't find element, so we can terminate execution
        return count
      }
      count += n - j
      pos = j + 1
    }
    count
  }

}
