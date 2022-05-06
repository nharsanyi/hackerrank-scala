package com.interviewbit

object MajorityElement {

  def majorityElement(A: Array[Int]): Int  = {
    val n = A.length
    val s: Array[Int] = A.sorted
    val midIndex = math.floor(n / 2).toInt
    s(midIndex)
  }

}
