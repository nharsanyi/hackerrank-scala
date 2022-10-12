package com.hackerrank

import org.scalatest.FunSuite

class KangarooTest extends FunSuite {

  test("test1") {
    assertResult(6)(Kangaroo.kangaroo(0, 3, 4, 2))
  }

  test("test2") {
    assertResult(6)(Kangaroo.kangaroo(43, 2, 70, 2))
  }
}
