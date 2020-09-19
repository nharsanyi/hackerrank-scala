package com.hackerrank

import org.scalatest.FunSuite

class CountTripletsTest extends FunSuite {

  test("testCountTriplets") {
    val input = Array(1l, 2l, 2l, 4l)
    assertResult(2l)(CountTriplets.countTriplets(input, 2l))
  }

  test("testCountTriplets2") {
    val input = Array(1l, 3l, 9l, 9l, 27l, 81l)
    assertResult(6l)(CountTriplets.countTriplets(input, 3l))
  }

  test("testCountTriplets3") {
    val input = Array(
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l,
      1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l, 1l
    )
    assertResult(161700l)(CountTriplets.countTriplets(input, 1l))
  }
}
