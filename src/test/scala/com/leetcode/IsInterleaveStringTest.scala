package com.leetcode

import org.scalatest.FunSuite

class IsInterleaveStringTest extends FunSuite {

  test("should return result for input 1") {
    assertResult(true)(IsInterleaveString.isInterleave("", "", ""))
    assertResult(true)(IsInterleaveString.isInterleaveNonOptimal("", "", ""))
  }

  /**
    * "aabcc"
"dbbca"
"aadbbcbcac"
    */
  test("should return result for input 2") {
    assertResult(true)(IsInterleaveString.isInterleave("aabcc", "dbbca", "aadbbcbcac"))
    assertResult(true)(IsInterleaveString.isInterleaveNonOptimal("aabcc", "dbbca", "aadbbcbcac"))
  }

  test("should return result for input 3") {
    assertResult(false)(IsInterleaveString.isInterleave("aabcc", "dbbca", "aadbbbaccc"))
    assertResult(false)(IsInterleaveString.isInterleaveNonOptimal("aabcc", "dbbca", "aadbbbaccc"))
  }


}
