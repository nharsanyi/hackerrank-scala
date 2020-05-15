package com.hackerrank

import org.scalatest.FunSuite

class MinimumSwaps2Test extends FunSuite {

  test("should count swaps") {
    val arr = Array(4, 3, 1, 2)
    assertResult(3)(MinimumSwaps2.minimumSwaps(arr))
  }

  test("should count swaps 2") {
    val arr = Array(2, 3, 4, 1, 5)
    assertResult(3)(MinimumSwaps2.minimumSwaps(arr))
  }
}
