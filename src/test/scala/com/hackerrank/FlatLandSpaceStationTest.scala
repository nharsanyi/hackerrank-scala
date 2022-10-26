package com.hackerrank

import org.scalatest.FunSuite

class FlatLandSpaceStationTest extends FunSuite {

  test("test 1") {
    val actual = FlatLandSpaceStation.flatlandSpaceStations(5, Array(0, 4))
    assertResult(2)(actual)
  }
}
