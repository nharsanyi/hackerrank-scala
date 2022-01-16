package com.hackerrank

import org.scalatest.FunSuite

class CtciBubbleSortTest extends FunSuite {

  test("Swap needed") {
    val array = Array(6, 4, 1)
    val result = CtciBubbleSort.countSwaps(array)
    assertResult(3)(result._1)
    assertResult(1)(result._2)
    assertResult(6)(result._3)
  }

  test("Swap not needed") {
    val array = Array(1, 2, 3)
    val result = CtciBubbleSort.countSwaps(array)
    assertResult(0)(result._1)
    assertResult(1)(result._2)
    assertResult(3)(result._3)
  }
}
