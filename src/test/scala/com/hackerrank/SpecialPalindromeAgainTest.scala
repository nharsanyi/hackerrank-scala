package com.hackerrank

import org.scalatest.FunSuite

class SpecialPalindromeAgainTest extends FunSuite {

  test("should return 12 for mnonopoo") {
    val input = "mnonopoo"
    assertResult(12)(SpecialPalindromeAgain.substrCount(input.length, input))
  }

  test("should return 10 for aaaa") {
    val input = "aaaa"
    assertResult(10)(SpecialPalindromeAgain.substrCount(input.length, input))
  }

  test("should return 10 for abcbaba") {
    val input = "abcbaba"
    assertResult(10)(SpecialPalindromeAgain.substrCount(input.length, input))
  }

  test("should return 7 for asasd") {
    val input = "asasd"
    assertResult(7)(SpecialPalindromeAgain.substrCount(input.length, input))
  }

}
