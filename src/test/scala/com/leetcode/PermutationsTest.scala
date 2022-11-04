package com.leetcode

import org.scalatest.FunSuite

class PermutationsTest extends FunSuite {

  test("should return result 1" ) {
    val input = Array(1,2,3)
    assertResult(List(List(3, 2, 1), List(2, 3, 1), List(2, 1, 3), List(3, 1, 2), List(1, 3, 2), List(1, 2, 3)))(Permutations.permute(input))
  }

  test("should return result 2" ) {
    val input = Array(1)
    assertResult(List(List(1)))(Permutations.permute(input))
  }

  test("should return result 3" ) {
    val input = Array(1, 2)
    assertResult(List(List(2, 1), List(1, 2)))(Permutations.permute(input))
  }
}
