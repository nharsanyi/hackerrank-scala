package com.hackerrank

object RepeatedString {

  def repeatedString(s: String, n: Long): Long = {
    val ss = s.length

    val countA: Int = s.count(_ == 'a')

    val repeatedCount: Long = n / ss
    val rem = (n % ss).toInt

    var result = countA * repeatedCount
    for (i <- 0 to rem - 1) {
      if (s.charAt(i) == 'a') result += 1
    }
    result
  }
}
