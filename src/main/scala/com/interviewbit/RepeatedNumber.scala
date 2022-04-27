package com.interviewbit

object RepeatedNumber {

  def repeatedNumber(A: Array[Int]): Int = {
    val n = A.length
    val tmp = Array.ofDim[Int](n + 1)
    for (i <- A) {
      tmp(i) += 1
    }
    var i = 0
    while (i <= n && tmp(i) <= 1) {
      i+=1
    }
    if (i == n + 1) -1 else i
  }

}
