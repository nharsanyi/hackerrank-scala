package com.hackerrank

object CoinChange {

  def getWays(total: Int, coins: Array[Long]): Long = {
    val dp: Array[Long] = Array.ofDim[Long](total + 1)
    dp(0) = 1l

    for (coin <- coins) {
      for (j <- coin.toInt to total) {
        dp(j) += dp(j - coin.toInt)
      }
    }
    dp(total)

  }

}
