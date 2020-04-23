package com.hackerrank

import org.scalatest.FunSuite

class CountInversionsTest extends FunSuite {

  test("should count 0 if the list is sorted") {
    assertResult(0)(CountInversions.countInversions(Array(1, 1, 1, 2, 2)))
  }

  test("should count inversions needed to sort list") {
    assertResult(4)(CountInversions.countInversions(Array(2, 1, 3, 1, 2)))
  }
}
