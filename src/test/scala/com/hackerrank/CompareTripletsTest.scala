package com.hackerrank

import org.scalatest.FunSuite

class CompareTripletsTest extends FunSuite {

  test("testCompareTriplets 1") {
    val a = Array(5, 6, 7)
    val b = Array(3, 6, 10)
    assertResult(Array(1, 1))(CompareTriplets.compareTriplets(a, b))
  }

  test("testCompareTriplets 2") {
    val a = Array(3, 6, 7)
    val b = Array(3, 6, 7)
    assertResult(Array(0, 0))(CompareTriplets.compareTriplets(a, b))
  }

}
