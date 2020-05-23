package com.hackerrank

object LongestSubArray {

  /**
    * What is the length of the longest subarray containing no more
    * than 2 distinct values such that the distinct values differ
    * by no more than 1
    *
    * @param arr
    * @return
    */
  def longestSubarray(arr: Array[Int]): Int = {
    val n = arr.length
    var result = Integer.MIN_VALUE
    var i = 0
    while (i < n) {
      val a = arr(i)
      while (arr(i) == a) {
        i += 1
      }
//      val b =
    }
    result

  }


}
