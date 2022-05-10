package com.leetcode

import org.scalatest.FunSuite

class ValidParenthesesTest extends FunSuite {

  test("should return if it's valid for input 1") {
    assertResult(true)(ValidParentheses.isValid("()"))
  }

  test("should return if it's valid for input 2") {
    assertResult(true)(ValidParentheses.isValid("(){}[]"))
  }

  test("should return if it's valid for input 3") {
    assertResult(false)(ValidParentheses.isValid("(]"))
  }

  test("should return if it's valid for input 4") {
    assertResult(false)(ValidParentheses.isValid("([)]"))
  }
}
