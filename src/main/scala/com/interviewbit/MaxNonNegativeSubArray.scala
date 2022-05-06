package com.interviewbit

object MaxNonNegativeSubArray {

  def maxset(A: Array[Int]): Array[Int]  = {
    var currSum = 0l
    var currMax = 0l
    var startIndex = 0
    var endIndex = 0
    var maxStartIndex = 0
    var maxEndIndex = 0
    val n = A.length
    var i = 0
    while (i < n) {
      val currA = A(i)
      if (currA >= 0) {
        currSum += currA
        i += 1
      } else {
        endIndex = i
        if (currSum > currMax || (currSum == currMax && endIndex - startIndex > maxEndIndex - maxStartIndex)) {
          maxStartIndex = startIndex
          maxEndIndex = endIndex
          currMax = currSum
        }
        while (i < n && A(i) < 0) {
          i += 1
        }
        startIndex = i
        endIndex = i
        currSum = 0
      }
    }
    if (currSum > currMax || (currSum == currMax && n - startIndex > maxEndIndex - maxStartIndex)) {
      maxStartIndex = startIndex
      maxEndIndex = n
      currMax = currSum
    }
    val length = maxEndIndex - maxStartIndex
    val result: Array[Int] = Array.ofDim[Int](length)
    for (i <- maxStartIndex to maxEndIndex - 1) {
      val index: Int = i - maxStartIndex
      result(index) = A(i)
    }
    result
  }

}
