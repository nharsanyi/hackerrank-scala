package com.leetcode

import scala.collection.mutable.ArrayBuffer

object HouseRobber {

  def rob(nums: Array[Int]): Int = {

    val n = nums.length
    val dp = Array.fill[Int](n)(-1)
    if (n == 1) {
      return nums(0)
    }
    dp(0) = nums(0)
    dp(1) = nums(1)

    def solve(n: Int): Int = {
      if (n < 0) {
        return 0
      }
      if (dp(n) != -1) {
        return dp(n)
      }
      val curr = nums(n)
      var max = -1
      for (i <- 0 to n - 2) {
        val r = solve(i)
        max = math.max(max, r)
      }
      dp(n) = curr + max
      curr + max
    }
    math.max(solve(n - 1), solve(n - 2))
  }

  def rob2(nums: Array[Int]): Int = {
    val n = nums.size
    val dp = Array.fill[Int](n)(-1)

    def solve(i: Int): Int = {
      if (i < 0) return 0
      if (dp(i) != -1) return dp(i)
      val robPrev = solve(i - 1)
      val robCurr = solve(i - 2) + nums(i)
      dp(i) = math.max(robPrev, robCurr)
      return dp(i)
    }
    solve(n - 1)
  }
}
