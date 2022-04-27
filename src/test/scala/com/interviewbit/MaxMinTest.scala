package com.interviewbit

import org.scalatest.FunSuite

class MaxMinTest extends FunSuite {

  test("should return for input 1") {
    val input = Array(-2, 1, -4, 5, 3)
    assertResult(1)(MaxMin.solve(input))
  }

}
