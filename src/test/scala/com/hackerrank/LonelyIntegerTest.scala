package com.hackerrank

import org.scalatest.FunSuite

class LonelyIntegerTest extends FunSuite {

  test("a") {
    val res = LonelyInteger.lonelyinteger(Array(1, 1, 2))
    assertResult(2)(res)
  }
}
