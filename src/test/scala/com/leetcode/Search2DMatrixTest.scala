package com.leetcode

import org.scalatest.FunSuite

class Search2DMatrixTest extends  FunSuite {

  test("should return for input 1") {
    val input = Array(
      Array(1, 3, 5, 7),
      Array(10, 11, 16, 20),
      Array(23, 30, 34, 60)
    )
    assertResult(true)(Search2DMatrix.searchMatrix(input, 3))
  }

  test("should return for input 2") {
    val input = Array(
      Array(1, 3, 5, 7),
      Array(10, 11, 16, 20),
      Array(23, 30, 34, 60)
    )
    assertResult(false)(Search2DMatrix.searchMatrix(input, 13))
  }

  test("should return for input 3") {
    val input = Array(
      Array(1, 3)
    )
    assertResult(true)(Search2DMatrix.searchMatrix(input, 3))
  }
}
