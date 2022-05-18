package com.leetcode

import org.scalatest.FunSuite

class MinStackTest extends FunSuite {

  test("should return result for input 1") {
    val stack = new MinStack()
    stack.push(-2)
    stack.push(0)
    stack.push(-3)
    assertResult(-3)(stack.getMin())
    stack.pop()
    assertResult(0)(stack.top())
    assertResult(-2)(stack.getMin())
  }

}
