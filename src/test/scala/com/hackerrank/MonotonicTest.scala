package com.hackerrank

import org.scalatest.FunSuite

class MonotonicTest extends FunSuite {

  test("test1") {
    assertResult(true)(Monotonic.isMonotonic(Array(1, 2, 5, 5, 8)))
  }

  test("test2") {
    assertResult(true)(Monotonic.isMonotonic(Array(9, 4, 4, 2, 2)))
  }

  test("test3") {
    assertResult(true)(Monotonic.isMonotonic(Array(9, 9, 9, 4, 4, 2, 2)))
  }

  test("test4") {
    assertResult(false)(Monotonic.isMonotonic(Array(1, 4, 6, 3)))
  }

  test("test5") {
    assertResult(true)(Monotonic.isMonotonic(Array(1, 1, 1, 1, 1, 1)))
  }
}
