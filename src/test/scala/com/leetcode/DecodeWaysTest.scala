package com.leetcode

import org.scalatest.FunSuite

class DecodeWaysTest extends FunSuite {

  test("should return result for input 1") {
    assertResult(2)(DecodeWays.numDecodings("12"))
  }

  test("should return result for input 2") {
    assertResult(3)(DecodeWays.numDecodings("226"))
  }
}
