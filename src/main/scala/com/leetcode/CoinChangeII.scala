package com.leetcode

object CoinChangeII {

  def change(amount: Int, coins: Array[Int]): Int = {
    val n = coins.size
    var dp = Array.fill[Array[Int]](n)(Array.fill[Int](amount + 1)(-1))
    for (i <- 0 to n - 1) {
      dp(i)(0) = 1
    }

    def solve(subAmount: Int, coinIndex: Int): Int = {
      if (coinIndex < 0 || subAmount < 0) return 0
      if (dp(coinIndex)(subAmount) != -1) return dp(coinIndex)(subAmount)
      val coin = coins(coinIndex)
      var res = 0
      if (coin <= subAmount) {
        res += solve(subAmount - coin, coinIndex)  // // use the new coin
      }
      if (coinIndex - 1 >= 0) {
        res += solve(subAmount, coinIndex - 1) // don't use new coin
      }
      dp(coinIndex)(subAmount) = res
      res
    }
    solve(amount, n - 1)
  }
}
