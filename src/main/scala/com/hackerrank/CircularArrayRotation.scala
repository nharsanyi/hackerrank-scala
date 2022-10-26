package com.hackerrank

import scala.collection.mutable.ArrayBuffer

object CircularArrayRotation {

  def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
    // Write your code here
    val allP = new ArrayBuffer[Int]()
    allP ++= a
    allP ++= a
    val n = a.length
    val startIndex = n - (k % n)
    queries.map(index => allP((startIndex + index) % n))
  }
}
