package com.hackerrank

import org.scalatest.FunSuite

class LuckBalanceTest extends FunSuite {

  test("testLuckBalance") {
    val input = Array(
      Array(5, 1),
      Array(2, 1),
      Array(1, 1),
      Array(8, 1),
      Array(10, 0),
      Array(5, 0)
    )
    assertResult(29)(LuckBalance.luckBalance(3, input))
  }

  test("testLuckBalance 2") {
    val input = Array(
      Array(5, 1),
      Array(1, 1),
      Array(4, 0)
    )
    assertResult(10)(LuckBalance.luckBalance(2, input))
  }

  test("testLuckBalance 3") {
    val input = Array(
      Array(5, 1),
      Array(1, 1),
      Array(4, 0)
    )
    assertResult(8)(LuckBalance.luckBalance(1, input))
  }

}
