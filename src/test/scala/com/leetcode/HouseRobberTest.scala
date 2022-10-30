package com.leetcode

import org.scalatest.FunSuite

class HouseRobberTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(1,2,3,1)
    assertResult(4)(HouseRobber.rob(input))
  }

  test("should return result for input 2") {
    val input = Array(2,7,9,3,1)
    assertResult(12)(HouseRobber.rob(input))
  }

  test("should return result for input 3") {
    val input = Array(2, 1, 1, 2)
    assertResult(4)(HouseRobber.rob(input))
  }

  test("should return result for input 4") {
    val input = Array(114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240)
    assertResult(4173)(HouseRobber.rob(input))
  }

  test("should return result 2 for input 1") {
    val input = Array(1,2,3,1)
    assertResult(4)(HouseRobber.rob2(input))
  }

  test("should return result 2 for input 2") {
    val input = Array(2,7,9,3,1)
    assertResult(12)(HouseRobber.rob2(input))
  }

  test("should return result 2 for input 3") {
    val input = Array(2, 1, 1, 2)
    assertResult(4)(HouseRobber.rob2(input))
  }

  test("should return result 2 for input 4") {
    val input = Array(114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240)
    assertResult(4173)(HouseRobber.rob2(input))
  }

}
