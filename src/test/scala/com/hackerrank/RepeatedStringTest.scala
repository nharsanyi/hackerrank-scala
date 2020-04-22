package com.hackerrank

import org.scalatest.FunSuite

class RepeatedStringTest extends FunSuite {

  test("should return count a in the repeated string") {
    assertResult(4)(RepeatedString.repeatedString("abcac", 10))
    assertResult(7)(RepeatedString.repeatedString("aba", 10))
    assertResult(2)(RepeatedString.repeatedString("abaa", 3))
    assertResult(1000000000000l)(RepeatedString.repeatedString("a", 1000000000000l))
  }

}
