package com.interviewbit

import org.scalatest.FunSuite

class OccurenceOfEachNumberTest extends FunSuite {

  test("should return for input 1") {
    val input = Array(1, 2, 3)
    assertResult(Array(1, 1, 1))(OccurenceOfEachNumber.findOccurences(input))
  }

  test("should return for input 2") {
    val input = Array(4, 3, 3)
    assertResult(Array(2, 1))(OccurenceOfEachNumber.findOccurences(input))
  }
}
