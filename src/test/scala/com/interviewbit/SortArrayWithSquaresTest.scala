package com.interviewbit

import org.scalatest.FunSuite

class SortArrayWithSquaresTest extends FunSuite {

  test("should sort square input 1") {
    val input = Array(-6, -3, -1, 2, 4, 5)
    assertResult(Array(1, 4, 9, 16, 25, 36))(SortArrayWithSquares.solve(input))
  }

  test("should sort square input 2") {
    val input = Array(-5, -4, -2, 0, 1)
    assertResult(Array(0, 1, 4, 16, 25))(SortArrayWithSquares.solve(input))
  }

  test("should sort square if no negative") {
    val input = Array(0, 1, 2, 4, 5)
    assertResult(Array(0, 1, 4, 16, 25))(SortArrayWithSquares.solve(input))
  }

  test("should sort square if no positive") {
    val input = Array(-5, -4, -2, -1)
    assertResult(Array(1, 4, 16, 25))(SortArrayWithSquares.solve(input))
  }
}
