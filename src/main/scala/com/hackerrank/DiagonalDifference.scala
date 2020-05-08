package com.hackerrank

object DiagonalDifference {

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    val n: Int = arr.length - 1
    var sum1 = 0
    var sum2 = 0
    for (i <- 0 to n) {
      sum1 += arr(i)(i)
      sum2 += arr(i)(n - i)
    }
    math.abs(sum1 - sum2)
  }

}
