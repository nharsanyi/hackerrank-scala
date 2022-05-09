package com.leetcode

import org.scalatest.FunSuite

class KthLargestTest extends FunSuite {

  test("should return kth largest for input 1") {
    val underTest = new KthLargest(3, Array(4, 5, 8, 2))
    assertResult(4)(underTest.add(3))
    assertResult(5)(underTest.add(5))
    assertResult(5)(underTest.add(10))
    assertResult(8)(underTest.add(9))
    assertResult(8)(underTest.add(4))
  }

}
