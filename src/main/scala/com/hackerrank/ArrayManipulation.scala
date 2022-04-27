package com.hackerrank

import scala.collection.mutable

object ArrayManipulation {

  def arrayManipulation1(n: Int, queries: Array[Array[Int]]): Long = {
    // Write your code here
    val buffer = mutable.HashMap.empty[Long, Long]
    var max = Long.MinValue
    for (query <- queries) {
      val start = query(0)
      val end = query(1)
      val k = query(2)
      for (i <- start to end) {
        val newVal = buffer.getOrElse(i, 0l) + k
        buffer.put(i, newVal)
        max = math.max(newVal, max)
      }
    }
    max
  }

  def arrayManipulation2(n: Int, queries: Array[Array[Int]]): Long = {
    // Write your code here
    val buffer = mutable.ArrayBuffer.fill[Long](n + 2)(0l)
    var max = Long.MinValue
    for (query <- queries) {
      val start = query(0) - 1
      val end = query(1)
      val k = query(2)
      buffer(start) += k
      buffer(end) -= k
    }
    var sum = 0l
    for (i <- 0 to n - 1) {
      sum += buffer(i)
      max = math.max(sum, max)
    }
    max
  }
}
