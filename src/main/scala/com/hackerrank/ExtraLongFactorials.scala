package com.hackerrank

object ExtraLongFactorials {

  def extraLongFactorials(n: Int): Int = {

    def loop(result: BigInt, n: Int): BigInt = {
      if (n == 1) result
      else loop(result.*(BigInt(n)), n - 1)
    }

    loop(BigInt(1), n).toInt
  }

}
