package com.interviewbit

import org.scalatest.FunSuite

class LargestSumContiguousSubArrayTest extends FunSuite {

  test("should return 1 if can make elements equal") {
    val input = Array(1, 2, 3, 4, -10)
    assertResult(10)(LargestSumContiguousSubArray.maxSubArray(input))
  }

  test("should return 1 if can make elements equal 2") {
    val input = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    assertResult(6)(LargestSumContiguousSubArray.maxSubArray(input))
  }

  test("should return 1 if can make elements equal 3") {
    val input = Array(-500)
    assertResult(-500)(LargestSumContiguousSubArray.maxSubArray(input))
  }


}
