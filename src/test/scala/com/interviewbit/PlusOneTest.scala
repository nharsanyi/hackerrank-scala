package com.interviewbit

import org.scalatest.FunSuite

class PlusOneTest extends FunSuite {

  test("should return plus one") {
    val input = Array(1, 2, 3)
    assertResult(Array(1,2,4))(PlusOne.plusOne(input))
  }

  test("should return plus one for 2 digits to 3 digits") {
    val input = Array(9, 9)
    assertResult(Array(1,0,0))(PlusOne.plusOne(input))
  }

  test("should return plus one for 1 digit with remaining") {
    val input = Array(9)
    assertResult(Array(1,0))(PlusOne.plusOne(input))
  }

  test("should return plus one for 1 digit no remaining") {
    val input = Array(2)
    assertResult(Array(3))(PlusOne.plusOne(input))
  }

  test("should return plus one without extra 0s") {
    val input = Array(0, 2)
    assertResult(Array(3))(PlusOne.plusOne(input))
  }
}
