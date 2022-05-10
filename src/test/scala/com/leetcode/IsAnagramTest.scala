package com.leetcode

import org.scalatest.FunSuite

class IsAnagramTest extends FunSuite {

  test("should return for input 1") {
    assertResult(true)(IsAnagram.isAnagram("anagram", "nagaram"))
  }

  test("should return for input 2") {
    assertResult(false)(IsAnagram.isAnagram("rat", "car"))
  }
}
