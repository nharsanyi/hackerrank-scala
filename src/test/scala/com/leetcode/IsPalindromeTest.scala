package com.leetcode

import org.scalatest.FunSuite

class IsPalindromeTest extends FunSuite {

  test("should return for input 1") {
    assertResult(true)(IsPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
  }

  test("should return for input 2") {
    assertResult(true)(IsPalindrome.isPalindrome(" "))
  }

  test("should return for input 3") {
    assertResult(false)(IsPalindrome.isPalindrome(" 0p"))
  }

  test("should return for input 4") {
    assertResult(false)(IsPalindrome.isPalindrome("race a car"))
  }
}
