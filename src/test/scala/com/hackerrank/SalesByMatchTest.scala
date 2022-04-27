package com.hackerrank

import org.scalatest.FunSuite

class SalesByMatchTest extends FunSuite {

  test("should count match") {
    assertResult(2)(SalesByMatch.sockMerchant(7, Array(1, 2, 1, 2, 1, 3, 2)))
  }

  test("should count match 2") {
    assertResult(3)(SalesByMatch.sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)))
  }

}
