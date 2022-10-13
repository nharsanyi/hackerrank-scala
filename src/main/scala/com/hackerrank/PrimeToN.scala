package com.hackerrank

import scala.collection.mutable.ArrayBuffer

object PrimeToN {

  def getPrimes(n: Int): Array[Int] = {
    val tmp = Array.fill[Int](n + 1)(-1)
    if (n  == 1) {
      return Array()
    }
    if (n == 2) {
      return Array(2)
    }
    if (n == 3) {
      return Array(2, 3)
    }
    tmp(2) = 1 // prime
    tmp(3) = 1 // prime
    var i = 2
    while (i <= n) {
      if (tmp(i) != 0) {
        tmp(i) = 1
        var j = i + i
        while (j <= n) {
          tmp(j) = 0 // not prime
          j = j + i
        }
      }
      i = i + 1
    }
    val result = ArrayBuffer.empty[Int]
    for (i <- 2 to n) {
      if (tmp(i) == 1) {
        result.append(i)
      }
    }
    result.toArray
  }

}
