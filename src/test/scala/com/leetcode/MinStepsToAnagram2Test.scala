package com.leetcode

import org.scalatest.FunSuite

class MinStepsToAnagram2Test extends FunSuite {

  test("should return minsteps if not anagram") {
    assertResult(7)(MinStepsToAnagram2.minSteps("leetcode", "coats"))
  }

  test("should return minsteps if anagram") {
    assertResult(0)(MinStepsToAnagram2.minSteps("night", "thing"))
  }

}
