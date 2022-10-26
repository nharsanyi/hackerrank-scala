package com.hackerrank

object LongestCommonSubs {

  def longestCommonSubsequence(text1: String, text2: String): Int = {
    val n = text1.size
    val m = text2.size
    var dp = Array.fill(n + 1)(Array.fill[Int](m + 1)(-1))
    for (j <- 0 to m) {
      dp(0)(j) = 0
    }
    for (i <- 0 to n) {
      dp(i)(0) = 0
    }

    def solve(i1: Int, i2: Int): Int = {
      if (i1 < 0 || i2 < 0) {
        return 0
      }
      if (dp(i1)(i2) != -1) {
        return dp(i1)(i2)
      }
      if (text1.charAt(i1 - 1) == text2.charAt(i2 - 1)) {
        println("same")
        dp(i1)(i2) = 1 + solve(i1 - 1, i2 - 1)
        return dp(i1)(i2)
      }
      dp(i1)(i2) = math.max(solve(i1 - 1, i2), solve(i1, i2 - 1))
      dp(i1)(i2)
    }
    solve(n, m)
  }
}
