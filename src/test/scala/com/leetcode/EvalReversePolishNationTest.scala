package com.leetcode

import org.scalatest.FunSuite

class EvalReversePolishNationTest extends FunSuite {

  test("should eval rpn for input 1") {
    val input = Array("2","1","+","3","*")
    assertResult(9)(EvalReversePolishNation.evalRPN(input))
  }

  test("should eval rpn for input 2") {
    val input = Array("4","13","5","/","+")
    assertResult(6)(EvalReversePolishNation.evalRPN(input))
  }

  test("should eval rpn for input 3") {
    val input = Array("10","6","9","3","+","-11","*","/","*","17","+","5","+")
    assertResult(22)(EvalReversePolishNation.evalRPN(input))
  }
}
