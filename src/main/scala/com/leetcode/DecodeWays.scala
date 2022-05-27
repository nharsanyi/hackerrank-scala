package com.leetcode

object DecodeWays {
  val LETTERS: List[String] = (1 to 26).toList.map(_.toString)
  def numDecodings(s: String): Int = {
    val n = s.length
    val dp = Array.ofDim[Int](n)

    def solve(index: Int): Int = {
      if (index == n) {
        return 1
      }
      if (dp(index) != 0) {
        return dp(index)
      }
      var ways = 0
      for (prefix <- LETTERS) {
        if (s.substring(index).startsWith(prefix)) {
          ways += solve(index + prefix.length)
        }
      }
      dp(index) = ways
      ways
    }

    solve(0)

  }
}
