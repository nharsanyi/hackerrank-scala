package com.leetcode

import org.scalatest.FunSuite

class GenerateParenthesesTest extends FunSuite {

  test("should return for input 1") {
    assertResult(List("((()))","(()())","(())()","()(())","()()()"))(GenerateParentheses.generateParenthesis(3))
  }

  test("should return for input 2") {
    assertResult(List("()"))(GenerateParentheses.generateParenthesis(1))
  }

  test("should return for input 3") {
    assertResult(List("(())", "()()"))(GenerateParentheses.generateParenthesis(2))
  }
}
