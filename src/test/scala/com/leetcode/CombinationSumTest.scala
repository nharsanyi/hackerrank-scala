package com.leetcode

import org.scalatest.FunSuite

class CombinationSumTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(2, 3, 6, 7)
    val actual = CombinationSum.combinationSum(input, 7)
    assert(actual.size == 2)
    assertResult(List(List(3, 2, 2), List(7)))(actual)
  }
}
