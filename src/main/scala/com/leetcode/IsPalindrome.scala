package com.leetcode

object IsPalindrome {

  def isPalindrome(s: String): Boolean = {
    val cleaned = s.toLowerCase.filter(_.isLetterOrDigit)
    val n = cleaned.length
    for (i <- 0 to (n / 2) - 1) {
      val left = cleaned.charAt(i)
      val right = cleaned.charAt(n - 1 - i)
      if (left != right) {
        return false
      }
    }
    true
  }

}
