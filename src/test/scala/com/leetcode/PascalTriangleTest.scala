package com.leetcode

import org.scalatest.FunSuite

class PascalTriangleTest extends FunSuite {

  test("should return result 1") {
    assertResult(List(List(1)))(PascalTriangle.generate(1))
  }

  test("should return result 2") {
    assertResult(List(List(1), List(1, 1)))(PascalTriangle.generate(2))
  }

  test("should return result 3") {
    assertResult(List(List(1), List(1, 1), List(1, 2, 1)))(PascalTriangle.generate(3))
  }

  test("should return result 4") {
    assertResult(List(List(1), List(1, 1), List(1, 2, 1), List(1, 3, 3, 1)))(PascalTriangle.generate(4))
  }

}
