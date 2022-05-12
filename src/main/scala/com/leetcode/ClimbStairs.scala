package com.leetcode

object ClimbStairs {

  def climbStairs(n: Int): Int = {
    val dp = Array.ofDim[Int](n + 1)
    dp(0) = 1
    dp(1) = 1

    def solve(n: Int): Int = {
      if (n < 0) {
        return 0
      }
      if (dp(n) > 0) {
        return dp(n)
      }
      val step1 = solve(n - 1)
      val step2 = solve(n - 2)
      dp(n) = step1 + step2
      dp(n)
    }
    solve(n)
  }

}
