package com.hackerrank

import org.scalatest.FunSuite

class CoinChangeTest extends FunSuite {

  test("testGetWays") {
    val coins = Array[Long](1, 2, 3)
    assertResult(4)(CoinChange.getWays(4, coins))

  }

  test("testGetWays 2") {
    val coins = Array[Long](2, 5, 3, 6)
    assertResult(5)(CoinChange.getWays(10, coins))

  }

  test("should return one if there is a single possible solution") {
    val coins = Array[Long](2, 5, 3, 6)
    assertResult(1)(CoinChange.getWays(2, coins))

  }

}
