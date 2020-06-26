package com.hackerrank

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object NonDivisibleSubset {

  def nonDivisibleSubset(k: Int, s: Array[Int]): Int = {
    // Write your code here
    val subsets = generatePairs(s)
    val result = new mutable.HashMap[Int, Int]()
    subsets.foreach(x => {
      val sum = x._1 + x._2
      if (sum % k != 0) {
        result.put(x._1, result.getOrElse(x._1, 0) + 1)
        result.put(x._2, result.getOrElse(x._2, 0) + 1)
      }
    })
    println(result.mkString(";"))
    result.size
  }

  private def generatePairs(s: Array[Int]): Array[(Int, Int)] = {
    val n = s.length
    val buffer = new ArrayBuffer[(Int, Int)]()
    for (i <- 0 to n - 2) {
      val c = s(i)
      for (j <- i + 1 to n - 1) {
        buffer.append((c, s(j)))
      }
    }
    buffer.toArray
  }

}
