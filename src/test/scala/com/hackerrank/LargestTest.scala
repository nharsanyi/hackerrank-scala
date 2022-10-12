package com.hackerrank

import org.scalatest.FunSuite

class LargestTest extends FunSuite {

  test("test1") {
    assertResult(6)(Largest.get2ndLargest(Array(2, 4, 5, 6, 1, 7)))
  }

  test("test2") {
    assertResult(6)(Largest.get2ndLargest(Array(2, 4, 5, 6, 1, 7, 6)))
  }

  test("test3") {
    assertResult(7)(Largest.get2ndLargest(Array(7, 4, 5, 6, 1, 7, 6)))
  }

  test("test4") {
    assertResult(5)(Largest.get2ndLargest(Array(1, 2, 3, 4, 5, 6)))
  }

}
