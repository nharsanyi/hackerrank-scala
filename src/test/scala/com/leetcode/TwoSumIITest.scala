package com.leetcode

import org.scalatest.FunSuite

class TwoSumIITest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(2,7,11,15)
    assertResult(Array(1,2))(TwoSumII.twoSum(input, 9))
  }

  test("should return result for input 2") {
    val input = Array(2,3,4)
    assertResult(Array(1,3))(TwoSumII.twoSum(input, 6))
  }
}
