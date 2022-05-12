package com.leetcode

import org.scalatest.FunSuite

class ClimbStairsTest extends FunSuite {

  test("should return result for input 1") {
    assertResult(2)(ClimbStairs.climbStairs(2))
  }

  test("should return result for input 2") {
    assertResult(3)(ClimbStairs.climbStairs(3))
  }
}
