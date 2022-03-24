package com.leetcode

import org.scalatest.FunSuite

class MinStepsToAnagramTest extends FunSuite {

  test("should return minsteps if not anagram") {
    assertResult(5)(MinStepsToAnagram.minSteps("leetcode", "practice"))
  }

  test("should return minsteps if not anagram 2") {
    assertResult(1)(MinStepsToAnagram.minSteps("bab", "aba"))
  }

  test("should return minsteps if not anagram 3") {
    assertResult(18)(MinStepsToAnagram.minSteps("gctcxyuluxjuxnsvmomavutrrfb", "qijrjrhqqjxjtprybrzpyfyqtzf"))
  }

  test("should return minsteps if not anagram 4") {
    assertResult(16)(MinStepsToAnagram.minSteps("yplsbcvbuqjycfdgxdzfuvyxkceppqmtdmzfednkx", "hjtiuoomfyeiencomvahzfsvqlqqumccburhadyua"))
  }


  test("should return 0 if anagram") {
    assertResult(0)(MinStepsToAnagram.minSteps("anagram", "mangaar"))
  }
}
