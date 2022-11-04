package com.leetcode

import scala.collection.mutable.ListBuffer

object Permutations {

  def permute(nums: Array[Int]): List[List[Int]] = {

    val n = nums.length

    def solve(index: Int): ListBuffer[List[Int]] = {
      if (index == 0) {
        val res = List(nums(index))
        return ListBuffer(res)
      }
      val currNum = nums(index)
      val previous = solve(index - 1)
      var result = ListBuffer.empty[List[Int]]
      for (list <- previous) {
        // [1] -> [1,2]; [2, 1]
        for (j <- 0 to list.size - 1) {
          var newList = ListBuffer[Int]()
          newList.addAll(list)
          newList.insert(j, currNum)
          result.addOne(newList.toList)
        }
        var newList = ListBuffer[Int]()
        newList.addAll(list)
        newList.addOne(currNum)
        result.addOne(newList.toList)
      }
      result
    }

    solve(n - 1).toList
  }
}
