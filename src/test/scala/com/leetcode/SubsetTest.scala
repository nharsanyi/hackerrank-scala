package com.leetcode

import org.scalatest.FunSuite

class SubsetTest extends FunSuite {

  test("should return subsets input 1") {
    val input = Array(1,2,3)
    assertResult(List(List(), List(1), List(2), List(1, 2), List(3), List(1, 3), List(2, 3), List(1, 2, 3)))(Subset.subsets(input))
  }

  test("should return subsets input 2") {
    val input = Array(1)
    assertResult(List(List(), List(1)))(Subset.subsets(input))
  }


  test("should return subsets backtrack input 1") {
    val input = Array(1,2,3)
    assertResult(List(List(), List(1), List(2), List(1, 2), List(3), List(1, 3), List(2, 3), List(1, 2, 3)))(Subset.subsets_backtrack(input))
  }

  test("should return subsets backtrack input 2") {
    val input = Array(1)
    assertResult(List(List(), List(1)))(Subset.subsets_backtrack(input))
  }

}
