package com.leetcode

import scala.collection.mutable.ListBuffer

object ThreeSum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val n = nums.length
    val sortedNums = nums.sorted
    val result = ListBuffer.empty[List[Int]]
    for (i <- 0 to n - 1) {
      val a = sortedNums(i)
      if ((i > 0 && a != sortedNums(i - 1)) || i == 0) {
        var l = i + 1
        var r = n - 1
        while (l < r) {
          val sum = sortedNums(l) + sortedNums(r) + a
          if (sum == 0) {
            result.addOne(List(a, sortedNums(l), sortedNums(r)))
            l += 1
            while (l < r && sortedNums(l) == sortedNums(l - 1)) {
              l += 1
            }
          } else if (sum > 0) {
            r -= 1
          } else {
            l += 1
          }
        }
      }
    }
    result.toList
  }

}
