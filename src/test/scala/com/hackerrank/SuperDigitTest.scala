package com.hackerrank

import org.scalatest.FunSuite

class SuperDigitTest extends FunSuite {

  test("test1") {
    assertResult(6)(SuperDigit.superDigit("123", 1))
  }
}
