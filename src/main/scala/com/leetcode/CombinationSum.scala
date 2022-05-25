package com.leetcode

import scala.collection.mutable.ListBuffer

object CombinationSum {

  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {

    val result = ListBuffer.empty[List[Int]]
    candidates.sorted

    // 2,3,6,7, target = 7
    def solve(index: Int, total: Int, curr: List[Int]): Unit = {

      if (target == total && !result.contains(curr)) {
        result.addOne(curr)
        return
      }
      if (total > target || index >= candidates.length) {
        return
      }
      val currCandidate = candidates(index)
      // include current one
      solve(index, total + currCandidate, currCandidate :: curr)

      // don't include
      solve(index + 1, total, curr)
    }

    for (i <- 0 to candidates.length - 1) {
      solve(i, 0, List())
    }
    result.toList

  }
}
