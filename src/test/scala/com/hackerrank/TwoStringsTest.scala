package com.hackerrank

import org.scalatest.FunSuite

class TwoStringsTest extends FunSuite {

  test("testTwoStrings 1") {
    assertResult("YES")(TwoStrings.twoStrings("hello", "world"))
  }

  test("testTwoStrings 2") {
    assertResult("NO")(TwoStrings.twoStrings("hi", "world"))
  }

  test("testTwoStrings 3") {
    assertResult("YES")(TwoStrings.twoStrings("aardvark", "apple"))
  }

}
