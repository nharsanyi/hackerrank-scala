package com.hackerrank

import org.scalatest.FunSuite

class PlusMinusTest extends FunSuite {

  test("should return fractions") {
    val arr = Array(-4, 3, -9, 0, 4, 1)
    assertResult(("0.500000", "0.333333", "0.166667"))(PlusMinus.plusMinus(arr))
  }

  test("should return 1 if the list has a single element") {
    val arr = Array[Int](6)
    assertResult(("1.000000", "0.000000", "0.000000"))(PlusMinus.plusMinus(arr))
  }

}
