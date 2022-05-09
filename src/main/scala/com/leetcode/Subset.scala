package com.leetcode

import scala.collection.mutable.ListBuffer

object Subset {

  def subsets(nums: Array[Int]): List[List[Int]] = {
    val n = nums.length
    val result = new ListBuffer[List[Int]]()
    for (i <- 0 to (1 << n) - 1) {
      val subList = new ListBuffer[Int]()

      for (j <- 0 to n - 1) {
        val currentBit = i & (1 << j)
        if (currentBit > 0) {
          subList += nums(j)
        }
      }
      result += subList.toList
    }
    result.toList
  }

}
