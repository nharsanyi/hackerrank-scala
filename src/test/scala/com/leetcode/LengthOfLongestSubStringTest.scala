package com.leetcode

import org.scalatest.FunSuite

class LengthOfLongestSubStringTest extends FunSuite {

  test("should return correct length for input 1") {
    val input = "abcabcbb"
    assertResult(3)(LengthOfLongestSubString.lengthOfLongestSubstring(input))
  }

  test("should return correct length for input 2") {
    val input = "bbbbb"
    assertResult(1)(LengthOfLongestSubString.lengthOfLongestSubstring(input))
  }

  test("should return correct length for input 3") {
    val input = "pwwkew"
    assertResult(3)(LengthOfLongestSubString.lengthOfLongestSubstring(input))
  }

  test("should return correct length for input 4") {
    val input = "aabaab!bb"
    assertResult(3)(LengthOfLongestSubString.lengthOfLongestSubstring(input))
  }

  test("should return correct length for input 5") {
    val input = "dvdf"
    assertResult(3)(LengthOfLongestSubString.lengthOfLongestSubstring(input))
  }
}
