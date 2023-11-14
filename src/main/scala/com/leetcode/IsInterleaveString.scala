package com.leetcode

object IsInterleaveString {
  def isInterleaveNonOptimal(s1: String, s2: String, s3: String): Boolean = {
    val n = s1.length
    val m = s2.length
    val nm = s3.length

    if (nm != n + m) return false

    def solve(i: Int, j: Int, k: Int): Boolean = {

      if (i == n && j == m && k == nm) return true
      if (i == n) {
        val currS2 = s2.charAt(j)
        val currS3 = s3.charAt(k)
        if (currS2 != currS3) return false
        return solve(i, j + 1, k + 1)
      } else if (j == m) {
        val currS1 = s1.charAt(i)
        val currS3 = s3.charAt(k)
        if (currS1 != currS3) return false
        return solve(i + 1, j, k + 1)
      } else {
        val currS1 = s1.charAt(i)
        val currS2 = s2.charAt(j)
        val currS3 = s3.charAt(k)

        if (currS1 != currS3 && currS2 != currS3) return false

        if (currS1 == currS2 && currS1 == currS3) {
          return solve(i + 1, j, k + 1) || solve(i, j + 1, k + 1)
        }
        if (currS1 == currS3) {
          return solve(i + 1, j, k + 1)
        }
        return solve(i, j + 1, k + 1)
      }
    }
    solve(0, 0, 0)
  }

  def isInterleave(s1: String, s2: String, s3: String): Boolean = {
    val n = s1.length
    val m = s2.length
    val nm = s3.length

    if (nm != n + m) return false
    val dp = Array.fill[Array[Int]](n + 1)(Array.fill[Int](m + 1)(-1))
    dp(0)(0) = 1
    for (j <- 0 to m - 1) {
      if (s2.charAt(j) == s3.charAt(j)) {
        dp(0)(j + 1) = dp(0)(j)
      }
    }
    for (i <- 0 to n - 1) {
      if (s1.charAt(i) == s3.charAt(i)) {
        dp(i + 1)(0) = dp(i)(0)
      }
    }


    def solve(i: Int, j: Int, k: Int): Boolean = {
      if (i == 0 && j == 0 && k == 0) return true
      if (i == 0 && j == 0) return false
      if (k == 0) return false
      val currS3 = s3.charAt(k - 1)
      if (dp(i)(j) != -1) return dp(i)(j) == 1
      if (i == 0) {
        val currS2 = s2.charAt(j - 1)
        if (currS2 == currS3) {
          dp(i)(j) = if (solve(i, j - 1, k - 1)) 1 else 0
        } else {
          dp(i)(j) = 0
        }
      } else if (j == 0) {
        val currS1 = s1.charAt(i - 1)
        if (currS1 == currS3) {
          dp(i)(j) = if (solve(i - 1, j, k - 1) ) 1 else 0
        } else {
          dp(i)(j) = 0
        }
      } else {
        val currS1 = s1.charAt(i - 1)
        val currS2 = s2.charAt(j - 1)
        val currS3 = s3.charAt(k - 1)
        if (currS1 == currS3) {
          dp(i)(j) = if (solve(i - 1, j, k - 1)) 1 else 0
        }
        if (currS2 == currS3) {
          val prev = solve(i, j - 1, k - 1)
          if (prev) {
            dp(i)(j) = 1
          }
        }
      }
      return dp(i)(j) == 1
    }
    solve(n, m, nm)
  }


}
