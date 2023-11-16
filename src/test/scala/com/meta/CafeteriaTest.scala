package com.meta

import org.scalatest.FunSuite

class CafeteriaTest extends FunSuite {

  test("test case 1") {
    assertResult(3)(Cafeteria.getMaxAdditionalDinersCount(10, 1, 2, Array(2, 6)))
  }

  test("test case 2") {
    assertResult(1)(Cafeteria.getMaxAdditionalDinersCount(15, 2, 3, Array(11, 6, 14)))
  }
}
