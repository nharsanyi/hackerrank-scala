package com.leetcode

import org.scalatest.FunSuite

class PascalTriangleIITest extends FunSuite {

  test("should return result 1") {
    assertResult(List(1))(PascalTriangleII.getRow(0))
  }

  test("should return result 2") {
    assertResult(List(1, 1))(PascalTriangleII.getRow(1))
  }

  test("should return result 3") {
    assertResult(List(1, 2, 1))(PascalTriangleII.getRow(2))
  }

  test("should return result 4") {
    assertResult(List(1, 3, 3, 1))(PascalTriangleII.getRow(3))
  }

}
