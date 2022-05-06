package com.interviewbit

import org.scalatest.FunSuite

class KthPascalRowTest extends FunSuite {

  test("should return 1st row") {
    assertResult(Array(1))(KthPascalRow.getRow(0))
  }

  test("should return 2nd row") {
    assertResult(Array(1, 1))(KthPascalRow.getRow(1))
  }

  test("should return 3rd row") {
    assertResult(Array(1, 2, 1))(KthPascalRow.getRow(2))
  }

  test("should return 4th row") {
    assertResult(Array(1, 3, 3, 1))(KthPascalRow.getRow(3))
  }

  test("should return 5th row") {
    assertResult(Array(1, 4, 6, 4, 1))(KthPascalRow.getRow(4))
  }

}
