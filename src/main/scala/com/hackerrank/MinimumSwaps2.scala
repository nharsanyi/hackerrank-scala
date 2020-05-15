package com.hackerrank

object MinimumSwaps2 {

  def minimumSwaps(arr: Array[Int]): Int = {
    val n: Int = arr.length
    val tmp = Array.ofDim[Int](n + 1)
    for (i <- 0 to n - 1) {
      val curr = arr(i)
      tmp(curr) = i // elements and their indeces in the original array
    }
    var result = 0
    for (i <- 0 to n - 2) {
      val curr = arr(i)
      if (curr != i + 1) {
        // swap
        arr(i) = i + 1
        arr(tmp(i + 1)) = curr
        tmp(curr) = tmp(i + 1)
        result += 1
      }
    }
    result
  }

}
