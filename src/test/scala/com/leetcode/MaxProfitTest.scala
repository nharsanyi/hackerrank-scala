package com.leetcode

import org.scalatest.FunSuite

class MaxProfitTest extends FunSuite {

  test("should return max profit input 1") {
    val input = Array(7,1,5,3,6,4)
    assertResult(5)(MaxProfit.maxProfit(input))
  }

  test("should return max profit input 2") {
    val input = Array(7,6,4,3,1)
    assertResult(0)(MaxProfit.maxProfit(input))
  }

}
