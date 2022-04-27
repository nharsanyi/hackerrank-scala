package com.interviewbit

object MakeEqualElementsArray {

  def solve(A: Array[Int], B: Int): Int  = {
    val a_minus_x = A(0) - B
    A.length
    val a = A(0)
    val a_plus_x = A(0) + B
    val n = A.length

    var i = 0
    while (i < n && (A(i) == a_minus_x || A(i) == a || A(i) == a_plus_x || A(i) - B == a_minus_x || A(i) - B == a || A(i) - B == a_plus_x || A(i) + B == a_minus_x || A(i) + B == a || A(i) + B == a_plus_x)) i += 1
    if (i < n) 0 else 1
  }


}
