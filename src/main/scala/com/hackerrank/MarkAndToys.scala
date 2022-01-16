package com.hackerrank

object MarkAndToys {

  def maximumToys(prices: Array[Int], k: Int): Int = {
    // Write your code here
    val sorted = prices.sorted
    var count = 0
    var i = 0
    val n = prices.length
    var sum = 0
    while (i < n && sum <= k - sorted(i)) {
      sum += sorted(i)
      count += 1
      i += 1
    }
    count
  }


}
