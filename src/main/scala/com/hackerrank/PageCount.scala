package com.hackerrank

object PageCount {


  def pageCount(n: Int, p: Int): Int = {
    // Write your code here
    val fromStart = p / 2
    var fromEnd = if (n % 2 == 0) (n + 1 - p) / 2 else (n - p) / 2

    math.min(fromStart, fromEnd)
  }

}
