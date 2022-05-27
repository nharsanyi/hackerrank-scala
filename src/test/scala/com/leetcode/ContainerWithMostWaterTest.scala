package com.leetcode

import org.scalatest.FunSuite

class ContainerWithMostWaterTest extends FunSuite {

    test("should return result for input 1") {
      val input = Array(1,8,6,2,5,4,8,3,7)
      assertResult(49)(ContainerWithMostWater.maxArea(input))
    }

  test("should return result for input 2") {
    val input = Array(1,1)
    assertResult(1)(ContainerWithMostWater.maxArea(input))
  }

  test("should return result for input 3") {
    val input = Array(2,3,4,5,18,17,6)
    assertResult(17)(ContainerWithMostWater.maxArea(input))
  }
}
