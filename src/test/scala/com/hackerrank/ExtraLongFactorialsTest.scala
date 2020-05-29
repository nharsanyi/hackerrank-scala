package com.hackerrank

import org.scalatest.FunSuite

class ExtraLongFactorialsTest extends FunSuite {

  test("testExtraLongFactorials") {
    assertResult(720)(ExtraLongFactorials.extraLongFactorials(6))
  }

}
