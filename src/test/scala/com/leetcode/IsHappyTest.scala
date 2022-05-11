package com.leetcode

import org.scalatest.FunSuite

class IsHappyTest extends FunSuite {

  test("should return true if ishappy") {
    assertResult(true)(IsHappy.isHappy(19))
  }

  test("should return true if ishappy 2") {
    assertResult(true)(IsHappy.isHappy(100))
  }

  test("should return true if ishappy 3") {
    assertResult(true)(IsHappy.isHappy(7))
  }

  test("should return true if ishappy 4") {
    assertResult(true)(IsHappy.isHappy(13))
    // 13 -> 11 -> 2 -> 4 -> 16 -> 37 -> 58 -> 25 + 64 = 89 -> 64 + 81 = 145 -> 17 +25= 42 -> 20 -> 4
  }

}
