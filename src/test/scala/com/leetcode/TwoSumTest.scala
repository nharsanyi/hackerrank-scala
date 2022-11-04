package com.leetcode

import org.scalatest.FunSuite

class TwoSumTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(2,7,11,15)
    val target = 9
    assertResult(Array(0, 1))(TwoSum.twoSum(input, target))
  }

  test("should return result for input 2") {
    val input = Array(3, 3)
    val target = 6
    assertResult(Array(0, 1))(TwoSum.twoSum(input, target))
  }

  test("should return result for input 3") {
    val input = Array(3, 2, 4)
    val target = 6
    assertResult(Array(1, 2))(TwoSum.twoSum(input, target))
  }

  test("should return 2 result for input 1") {
    val input = Array(2,7,11,15)
    val target = 9
    assertResult(Array(0, 1))(TwoSum.twoSum2(input, target))
  }

  test("should return 2 result for input 2") {
    val input = Array(3, 3)
    val target = 6
    assertResult(Array(0, 1))(TwoSum.twoSum2(input, target))
  }

  test("should return 2 result for input 3") {
    val input = Array(3, 2, 4)
    val target = 6
    assertResult(Array(1, 2))(TwoSum.twoSum2(input, target))
  }
}
