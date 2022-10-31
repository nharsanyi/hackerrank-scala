package com.leetcode

import org.scalatest.FunSuite

class PermutationInStringTest extends FunSuite {

  test("should return result 1") {
    assertResult(true)(PermutationInString.checkInclusion("ab", "eidbaooo"))
  }

  test("should return result 2") {
    assertResult(false)(PermutationInString.checkInclusion("ab", "eidbcccaooo"))
  }

  test("should return result 3") {
    assertResult(false)(PermutationInString.checkInclusion("ab", "a"))
  }
}
