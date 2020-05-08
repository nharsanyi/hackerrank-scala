package com.hackerrank

import org.scalatest.FunSuite

class HourglassSumTest extends FunSuite {

  test("should return max hourglass") {
    val m = Array(
      Array(-9, -9, -9, 1, 1, 1),
      Array(0, -9,  0,  4, 3, 2),
      Array(-9, -9, -9, 1, 2, 3),
      Array(0, 0, 8, 6, 6, 0),
      Array(0, 0, 0, -2, 0, 0),
      Array(0, 0, 1, 2, 4, 0)
    )
    assertResult(28)(HourglassSum.hourglassSum(m))
  }
}
