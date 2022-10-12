package com.hackerrank

object SuperDigit {

  def superDigit_Rec(n: String): Int = {
    var sum = 0
    for (digit <- n.toCharArray) {
      sum = sum + digit.asDigit
    }
    if (sum < 10) {
      return sum
    }
    superDigit_Rec(sum.toString())

  }

  def superDigit(n: String, k: Int): Int = {
    // Write your code here
    val sd = superDigit_Rec(n)
    val k_sd = k * sd
    superDigit_Rec(k_sd.toString())
  }
}
