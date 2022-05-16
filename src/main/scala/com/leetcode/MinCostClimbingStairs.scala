package com.leetcode

import scala.collection.mutable.ListBuffer

object MinCostClimbingStairs {

  def minCostClimbingStairs(cost: Array[Int]): Int = {

    val dp = Array.fill[Int](cost.length)(-1)
    dp(0) = cost(0)
    dp(1) = cost(1)

    def calculateCost(n: Int): Int = {
      if (n < 0) {
        return -1
      }
      if (dp(n) != -1) {
        return dp(n)
      }
      var minCost = Int.MaxValue
      val step1 = calculateCost(n - 1)
      if (step1 != -1) {
        val step2 = calculateCost(n - 2)
        if (step2 != -1) {
          minCost = math.min(step1, minCost)
          minCost = math.min(step2, minCost)
        } else {
          minCost = step1
        }
      }
      dp(n) = minCost + cost(n)
      dp(n)
    }
    math.min(calculateCost(cost.length - 1), calculateCost(cost.length - 2))
  }
}
