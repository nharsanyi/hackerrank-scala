package com.hackerrank

object SaveThePrisoner {

  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    // 3, 7, 3
    // 1,2,3,1,2,3,1,2,3,1,2,3
    val candies = m % n // 1
    val step = (candies - 1) % n
    s + step
  }
}
