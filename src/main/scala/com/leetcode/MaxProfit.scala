package com.leetcode

object MaxProfit {

  def maxProfit(prices: Array[Int]): Int = {
    val n = prices.length
    var j = 1
    var maxProfit = 0
    while (j < n) {
      var i = j
      var prev = prices(i - 1)
      while (i < n && prev > prices(i)) {
        prev = prices(i)
        i += 1
      }
      if (i == n) return maxProfit
      val currMin = prev
      var currentMax = prev
      var k = i
      while (k < n) {
        if (prices(k) > currentMax) {
          currentMax = prices(k)
        }
        k += 1
      }
      maxProfit = math.max(currentMax - currMin, maxProfit)
      j = i + 1
    }
    maxProfit
  }
}
