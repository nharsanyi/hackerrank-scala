package com.leetcode

object NumberOf1Bits {

  def hammingWeight(n: Int): Int = {

    def solve(k: Int): Int = {
      var counter = 0
      for (i <- 0 to 31) {
        val ithBit = k & (1 << i)
        if (ithBit != 0) {
          counter += 1
        }
      }
      counter
    }
    solve(n)
  }
}
