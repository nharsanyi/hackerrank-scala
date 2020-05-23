package com.hackerrank

import org.scalatest.FunSuite

class VowelSubStringTest extends FunSuite {

  test("should return subs 1") {
    assertResult("erdii")(VowelSubString.findSubstring("azerdii", 5))
  }

  test("should return subs 2") {
    assertResult("erqii")(VowelSubString.findSubstring("caberqiitefg", 5))
  }

  test("should return subs 3") {
    assertResult("Not found!")(VowelSubString.findSubstring("sdbdbdd", 2))
  }
}
