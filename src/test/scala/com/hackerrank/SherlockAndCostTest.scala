package com.hackerrank

import org.scalatest.FunSuite

class SherlockAndCostTest extends FunSuite {

  test("testCost 1") {
    val input = Array(1, 2, 3)
    assertResult(2)(SherlockAndCost.cost(input))
  }

  test("testCost 2") {
    val input = Array(10, 1, 10, 1, 10)
    assertResult(36)(SherlockAndCost.cost(input))
  }

}
