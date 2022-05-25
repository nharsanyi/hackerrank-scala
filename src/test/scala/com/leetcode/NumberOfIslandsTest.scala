package com.leetcode

import org.scalatest.FunSuite

class NumberOfIslandsTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(
      Array('1', '1', '1', '1', '0'),
      Array('1', '1', '0', '1', '0'),
      Array('1', '1', '0', '0', '0'),
      Array('0', '0', '0', '0', '0'),
    )
    assertResult(1)(NumberOfIslands.numIslands(input))
  }

  test("should return result for input 2") {
    val input = Array(
      Array('1', '1', '0', '0', '0'),
      Array('1', '1', '0', '0', '0'),
      Array('0', '0', '1', '0', '0'),
      Array('0', '0', '0', '1', '1'),
    )
    assertResult(3)(NumberOfIslands.numIslands(input))
  }

  test("should return result for input 3") {
    val input = Array(
      Array('1', '0', '1', '1', '1'),
      Array('1', '0', '1', '0', '1'),
      Array('1', '1', '1', '0', '1')
    )
    assertResult(1)(NumberOfIslands.numIslands(input))
  }
}
