package com.hackerrank

import org.scalatest.FunSuite

class NewYearChaosTest extends FunSuite {

  test("testMinimumBribes 1") {
    val queue = Array(2, 1, 5, 3, 4)
    assertResult(3)(NewYearChaos.minimumBribes(queue))
  }

  test("testMinimumBribes 2") {
    val queue = Array(2, 5, 1, 3, 4)
    assertResult(-1)(NewYearChaos.minimumBribes(queue))
  }

  test("testMinimumBribes 3") {
    val queue = Array(1, 2, 5, 3, 4, 7, 8, 6)
    assertResult(4)(NewYearChaos.minimumBribes(queue))
  }
}
