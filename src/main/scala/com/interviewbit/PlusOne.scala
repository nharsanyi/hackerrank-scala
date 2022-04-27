package com.interviewbit

object PlusOne {

  def plusOne(A: Array[Int]): Array[Int]  = {
    val n = A.length
    val result = Array.fill[Int](n)(0)
    var rem = 1
    var i = n - 1
    while (rem > 0 && i >= 0) {
      val newA = A(i) + rem
      val currA = newA % 10
      rem = newA / 10
      result(i) = currA
      i -= 1
    }
    while (i >= 0 && A(i) > 0) {
      result(i) = A(i)
      i -= 1
    }
    val res = if (rem > 0) {
      rem +: result
    } else {
      result
    }
    // remove 0s from the beginning
    res.dropWhile(_ == 0)
  }

}
