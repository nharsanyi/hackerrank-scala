package com.hackerrank

import org.scalatest.FunSuite

class MiniMaxSumTest extends FunSuite {

  test("testMiniMaxSum") {
    MiniMaxSum.miniMaxSum(Array(1, 2, 3, 4, 5))
  }

  test("testMiniMaxSum 2") {
    MiniMaxSum.miniMaxSum(Array(256741038, 623958417, 467905213, 714532089, 938071625))
  }

}
