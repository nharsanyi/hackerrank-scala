package com.hackerrank

import org.scalatest.FunSuite

class PermutingTwoArraysTest extends FunSuite {

  test("twoArrays case 1") {
    val as = Array(2, 1, 3)
    val bs = Array(7, 8, 9)
    assertResult("YES")(PermutingTwoArrays.twoArrays(10, as, bs))
  }

  test("twoArrays case 2") {
    val as = Array(1, 2, 2, 1)
    val bs = Array(3, 3, 3, 4)
    assertResult("NO")(PermutingTwoArrays.twoArrays(5, as, bs))
  }

}
