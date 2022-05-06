package com.interviewbit

import org.scalatest.FunSuite

class MaxNonNegativeSubArrayTest extends FunSuite {

  test("should return subset without tie") {
    val input = Array(1, 2, 5, -7, 2, 3)
    assertResult(Array(1, 2, 5))(MaxNonNegativeSubArray.maxset(input))
  }

  test("should return subset without tie if 1 element is the max") {
    val input = Array(10, -1, 2, 3, -4, 100)
    assertResult(Array(100))(MaxNonNegativeSubArray.maxset(input))
  }

  test("should return everything if there is no negative number") {
    val input = Array(10, 1, 2, 3, 4, 100)
    assertResult(Array(10, 1, 2, 3, 4, 100))(MaxNonNegativeSubArray.maxset(input))
  }

  test("should return nothing if there is no positive number") {
    val input = Array(-10, -1, -2, -3, -4, -100)
    assertResult(Array())(MaxNonNegativeSubArray.maxset(input))
  }

  test("should return longer if there is a tie") {
    val input = Array(2, 4, -9, 1, 2, 3)
    assertResult(Array(1, 2, 3))(MaxNonNegativeSubArray.maxset(input))
  }


  test("should return even if sum overflows") {
    val input = Array(1967513926, 1540383426, -1303455736, -521595368)
    assertResult(Array(1967513926, 1540383426))(MaxNonNegativeSubArray.maxset(input))
  }
}
