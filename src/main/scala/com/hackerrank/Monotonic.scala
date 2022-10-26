package com.hackerrank

object Monotonic {

  def isMonotonic(a: Array[Int]): Boolean = {
    val n = a.length
    if (n <= 2) return true
    val a0 = a(0)
    var i = 1
    while (i < n && a(i) == a0) i+=1
    if (i == n) return true
    val a1 = a(i)
    val isAsc = a1 > a0
    while (i < n) {
      var prev = a(i - 1)
      var curr = a(i)
      if ((isAsc && prev > curr) || (!isAsc && prev < curr)) return false
      i += 1
    }
    true
  }
}
