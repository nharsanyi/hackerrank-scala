package com.hackerrank

import org.scalatest.FunSuite

class MarkAndToysTest extends FunSuite {

  test("Test 1") {
    val prices = Array(1, 2, 3, 4)
    val k = 7
    val result = MarkAndToys.maximumToys(prices, k)
    assertResult(3)(result)
  }

  test("Test 2") {
    val prices = Array(1, 12, 5, 111, 200, 1000, 10)
    val k = 50
    val result = MarkAndToys.maximumToys(prices, k)
    assertResult(4)(result)
  }

}
