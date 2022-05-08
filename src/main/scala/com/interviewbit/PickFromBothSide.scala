package com.interviewbit

object PickFromBothSide {

  def solve(A: Array[Int], B: Int): Int  = {
    val n = A.length
    if (n == B) {
      return A.foldLeft(0)((sum, curr) => sum + curr)
    }
    var maxSum = Int.MinValue
    var sumLeft = 0

    for (i <- -1 to B - 1) {
      // if i == -1 => nothing is picked from left
      val currLeft = if (i > -1) A(i) else 0
      sumLeft += currLeft
      var sumRight = 0
      val maxFromRight = B - (i + 1)
      for (j <- n - 1 to n - maxFromRight  by -1) {
        sumRight += A(j)
      }
      val newSum = sumRight + sumLeft
      maxSum = math.max(newSum, maxSum)
    }
    maxSum
  }
}
