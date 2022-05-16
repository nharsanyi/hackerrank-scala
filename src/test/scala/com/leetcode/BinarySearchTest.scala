package com.leetcode

import org.scalatest.FunSuite

class BinarySearchTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(-1,0,3,5,9,12)
    assertResult(4)(BinarySearch.search(input, 9))
  }

  test("should return result for input 2") {
    val input = Array(-1,0,3,5,9,12)
    assertResult(-1)(BinarySearch.search(input, 2))
  }

}
