package com.leetcode

import org.scalatest.FunSuite

class LongestCharacterReplacementTest extends FunSuite {

  test("should return result for input 1") {
    assertResult(4)(LongestCharacterReplacement.characterReplacement("ABAB", 2))
  }

  test("should return result for input 2") {
    assertResult(4)(LongestCharacterReplacement.characterReplacement("AABABBA", 1))
  }

  test("should return result for input 3") {
    assertResult(5)(LongestCharacterReplacement.characterReplacement("BAAAB", 2))
  }

  test("should return result for input 4") {
    assertResult(5)(LongestCharacterReplacement.characterReplacement("ABBAB", 2))
  }
}
