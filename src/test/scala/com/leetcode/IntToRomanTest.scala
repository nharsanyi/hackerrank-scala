package com.leetcode

import org.scalatest.FunSuite

import scala.collection.immutable.BitSet

class IntToRomanTest extends FunSuite {

  test("should return result for input 1") {
    assertResult("LVIII")(IntToRoman.intToRoman(58))
  }

  test("should return result for input 2") {
    assertResult("MCMXCIV")(IntToRoman.intToRoman(1994))
  }

  test("should return result for input 3") {
    assertResult("MMMCMXCIX")(IntToRoman.intToRoman(3999))
  }

}
