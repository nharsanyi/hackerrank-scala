package com.interviewbit

object LargestSumContiguousSubArray {

  def maxSubArray(A: Array[Int]): Int = {
    var maxEnding = 0
    var maxSlice = Int.MinValue
    for (i <- A) {
      maxEnding = math.max(i, if (maxEnding == Int.MinValue) i else i + maxEnding)
      maxSlice = math.max(maxSlice, maxEnding)
    }
    maxSlice
  }

}
