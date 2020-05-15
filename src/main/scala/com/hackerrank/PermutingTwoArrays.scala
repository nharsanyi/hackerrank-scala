package com.hackerrank

object PermutingTwoArrays {

  def twoArrays(k: Int, as: Array[Int], bs: Array[Int]): String = {
    val sortedA = as.sorted
    val sortedB = bs.sorted(Ordering[Int].reverse)

    for (i <- 0 to as.length - 1) {
      val a = sortedA(i)
      val b = sortedB(i)
      if ((a + b) < k) return "NO"
    }
    return "YES"
  }

}
