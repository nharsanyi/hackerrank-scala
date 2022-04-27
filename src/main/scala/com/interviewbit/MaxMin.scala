package com.interviewbit

object MaxMin {

  def solve(A: Array[Int]): Int  = {
    var max = Int.MinValue
    var min = Int.MaxValue
    for (a <- A) {
      max = math.max(max, a)
      min = math.min(min, a)
    }
    max + min
  }
}
