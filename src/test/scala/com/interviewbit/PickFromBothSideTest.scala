package com.interviewbit

import org.scalatest.FunSuite

class PickFromBothSideTest extends FunSuite {

  test("should return total sum if has exactly B element") {
    val input = Array(1, 2, 3)
    assertResult(6)(PickFromBothSide.solve(input, 3))
  }

  test("should return max sum input 1") {
    val input = Array(5, -2, 3 , 1, 2)
    assertResult(8)(PickFromBothSide.solve(input, 3))
  }

  test("should return max sum input 2") {
    val input = Array(1, 2)
    assertResult(2)(PickFromBothSide.solve(input, 1))
  }
}
