package com.leetcode

import org.scalatest.FunSuite

class ContainsDuplicateTest extends FunSuite {

  test("should return for input 1") {
    val input = Array(1, 2, 3, 4)
    assertResult(false)(ContainsDuplicate.containsDuplicate(input))
  }

  test("should return for input 2") {
    val input = Array(1,1,1,3,3,4,3,2,4,2)
    assertResult(true)(ContainsDuplicate.containsDuplicate(input))
  }
}
