package com.hackerrank

import org.scalatest.FunSuite

class ArrayLeftRotationTest extends FunSuite {

  test("should rotate left with d < length") {
    assertResult(Array(5, 1, 2, 3, 4))(ArrayLeftRotation.rotLeft(Array(1, 2, 3, 4, 5), 4))
  }
}
