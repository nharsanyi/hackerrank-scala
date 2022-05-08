package com.interviewbit

object SortArrayWithSquares {

  def solve(A: Array[Int]): Array[Int]  = {
    val n = A.length
    val negSize = A.filter(_ < 0).length
    val squaresForNeg = Array.fill[Int](negSize)(0)
    val result = Array.fill[Int](n)(0)
    var j = 0
    while (j < n && A(j) < 0) {
      squaresForNeg(j) = A(j) * A(j)
      j += 1
    }
    var negIndex = negSize - 1
    var k = 0
    while (j < n && A(j) >= 0 && negIndex >= 0) {
      val currSquare = A(j) * A(j)
      val currNegSquare = squaresForNeg(negIndex)
      if (currSquare < currNegSquare) {
        result(k) = currSquare
        j += 1
      } else {
        result(k) = currNegSquare
        negIndex -= 1
      }
      k += 1
    }
    while (negIndex >= 0) {
      result(k) = squaresForNeg(negIndex)
      k += 1
      negIndex -= 1
    }
    while (j < n) {
      result(k) = A(j) * A(j)
      j += 1
      k += 1
    }
    result
  }
}
