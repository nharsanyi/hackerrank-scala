package com.hackerrank

object CompareTriplets {

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val n = a.length
    val result = Array.fill[Int](2)(0)

    for (i <- 0 to n - 1) {
      if (a(i) > b(i)) {
        result(0) += 1
      } else if (a(i) < b(i)) {
        result(1) += 1
      }
    }
    result
  }

}
