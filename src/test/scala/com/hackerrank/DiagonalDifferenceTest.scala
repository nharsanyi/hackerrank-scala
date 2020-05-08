package com.hackerrank

import org.scalatest.FunSuite

class DiagonalDifferenceTest extends FunSuite {

  test("should return diagonal difference") {
    val arr = Array(
      Array(11, 2, 4),
      Array(4, 5, 6),
      Array(10, 8, -12)
    )
    assertResult(15)(DiagonalDifference.diagonalDifference(arr))
  }

  test("should return 0 if matrix is empty") {
    val arr = Array[Array[Int]]()
    assertResult(0)(DiagonalDifference.diagonalDifference(arr))
  }

  test("should return the 0 if matrix has only 1 row/column") {
    val arr = Array(Array(5))
    assertResult(0)(DiagonalDifference.diagonalDifference(arr))
  }

}
