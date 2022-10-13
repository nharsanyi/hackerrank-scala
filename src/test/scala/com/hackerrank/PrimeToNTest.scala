package com.hackerrank

import org.scalatest.FunSuite

class PrimeToNTest extends FunSuite {

  test("test1") {
    val primes = PrimeToN.getPrimes(12)
    assertResult(Array(2, 3, 5, 7, 11))(primes)
  }

  test("test2") {
    val primes = PrimeToN.getPrimes(4)
    assertResult(Array(2, 3))(primes)
  }

  test("test3") {
    val primes = PrimeToN.getPrimes(100)
    assertResult(Array(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))(primes)
  }
}
