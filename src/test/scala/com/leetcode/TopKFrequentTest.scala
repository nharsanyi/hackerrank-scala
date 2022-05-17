package com.leetcode

import org.scalatest.FunSuite

class TopKFrequentTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(1,1,1,2,2,3)
    assertResult(Array(1, 2))(TopKFrequent.topKFrequent(input, 2))
  }

  test("should return result for input 2") {
    val input = Array(1)
    assertResult(Array(1))(TopKFrequent.topKFrequent(input, 1))
  }

}
