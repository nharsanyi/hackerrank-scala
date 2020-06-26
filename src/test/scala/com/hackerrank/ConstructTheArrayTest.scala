package com.hackerrank

import org.scalatest.FunSuite

class ConstructTheArrayTest extends FunSuite {

  test("testCountArray") {
    assertResult(3)(ConstructTheArray.countArray(4, 3, 2))
  }

}
