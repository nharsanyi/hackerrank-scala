package com.interviewbit

object MaximumSumTriplet {

  def solve(A: Array[Int]): Int = {
    val n = A.length
    var maxSum = 0
    val maxSuff = Array.fill[Int](n + 1)(0)
    maxSuff(n) = 0
    for (i <- n - 1 to 1 by -1) {
      maxSuff(i) = math.max(maxSuff(i + 1), A(i))
    }

    val lowerValue = new java.util.TreeSet[Int]()
    lowerValue.add(Int.MinValue)
    for (i <- 0 to n - 1) {
      if (maxSuff(i + 1) > A(i)) {
        maxSum = math.max(maxSum, lowerValue.lower(A(i)) + A(i) + maxSuff(i + 1))
        lowerValue.add(A(i))
      }
    }
    maxSum
  }

  def solve_sub_opt(A: Array[Int]): Int  = {
    val n = A.length
    var maxSum = 0
    for (i <- 1 to n - 2) {
      var max1 = 0
      var max2 = 0
      for (j <- 0 to i - 1) {
        if (A(j) < A(i)) {
          max1 = math.max(max1, A(j))
        }
      }
      for (j <- i + 1 to n - 1) {
        if (A(i) < A(j)) {
          max2 = math.max(max2, A(j))
        }
      }
      if (max1 > 0 && max2 > 0){
        maxSum = math.max(maxSum, A(i) + max1 + max2)
      }
    }
    maxSum
  }

  def naive_solve(A: Array[Int]): Int  = {
    val n = A.length
    var maxSum = 0
    for (i <- 0 to n - 3) {
      val ai = A(i)
      for (j <- i + 1 to n - 2) {
        val aj = A(j)
        if (aj > ai) {
          for (k <- j + 1 to n - 1) {
            val ak = A(k)
            if (ak > aj) {
              val sum = ai + aj + ak
              maxSum = math.max(sum, maxSum)
            }
          }
        }
      }
    }
    maxSum
  }

}
