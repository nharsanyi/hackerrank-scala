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

  def subsets_backtrack(nums: Array[Int]): List[List[Int]] = {
    val n = nums.size
    var result = ListBuffer.empty[List[Int]]


    def solve(i: Int): List[List[Int]] = {
      if (i < 0) {
        result.addOne(List.empty[Int])
        return result.toList
      }
      val prevLists = solve(i - 1)
      val currNum = nums(i)
      var currRes = ListBuffer.empty[List[Int]]
      for (l <- prevLists) {
        if (!l.isEmpty) {
          var added = ListBuffer.empty[Int]
          added.addAll(l)
          added.addOne(currNum)
          currRes.addOne(added.toList)
        }
      }
      currRes.addOne(List(currNum))
      result.addAll(currRes.toList)
      return result.toList
    }
    solve(n - 1)
    result.toList
  }

}
