package com.leetcode

import org.scalatest.FunSuite

class ThreeSumTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(-1,0,1,2,-1,-4)
    assertResult(List(List(-1,-1,2), List(-1,0,1)))(ThreeSum.threeSum(input))
  }
}
