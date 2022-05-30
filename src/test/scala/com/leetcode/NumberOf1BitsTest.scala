package com.leetcode

import org.scalatest.FunSuite

class NumberOf1BitsTest extends FunSuite {

  test("should return for input 1") {
    assertResult(3)(NumberOf1Bits.hammingWeight(11))
    // 1011 -> 2^3 + 2 + 1 = 11
  }

  test("should return for input 2") {
    assertResult(1)(NumberOf1Bits.hammingWeight(128))
  }

}
