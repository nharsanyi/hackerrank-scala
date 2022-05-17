package com.leetcode

import org.scalatest.FunSuite

class KClosestPointToOriginTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(Array(1, 3), Array(-2, 2))
    assertResult(Array(Array(-2, 2)))(KClosestPointToOrigin.kClosest(input, 1))
  }

  test("should return result for input 2") {
    val input = Array(Array(3, 3), Array(5, -1), Array(-2, 4))
    assertResult(Array(Array(3, 3), Array(-2, 4)))(KClosestPointToOrigin.kClosest(input, 2))
  }

}
