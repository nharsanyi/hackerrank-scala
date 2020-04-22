package com.hackerrank

class SockMerchantTest extends org.scalatest.FunSuite {

  test("should return pairs") {
    val arr = Array(10, 20, 20, 10, 10, 30, 50, 10, 2)
    val n = 9

    assertResult(3)(SockMerchant.sockMerchant(n, arr))
  }

}
