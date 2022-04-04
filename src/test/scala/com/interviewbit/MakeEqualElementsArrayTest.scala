package com.interviewbit

import org.scalatest.FunSuite

class MakeEqualElementsArrayTest extends FunSuite {

  test("should return 1 if can make elements equal") {
    val input = Array(2, 3, 1)
    assertResult(1)(MakeEqualElementsArray.solve(input, 1))
  }

  test("should return 0 if can't make elements equal") {
    val input = Array(2, 3, 1)
    assertResult(0)(MakeEqualElementsArray.solve(input, 2))
  }

  test("should return 1 if can make elements equal 2") {
    val input = Array(3, 1, 2, 1, 3, 1, 2, 2, 1, 1, 2, 3, 3, 1, 3, 3, 3, 2, 3, 3, 1, 1, 1, 3, 3, 1, 3, 1, 3, 3, 1, 1, 3, 2, 2, 3, 1, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1)
    assertResult(1)(MakeEqualElementsArray.solve(input, 1))
  }


}
