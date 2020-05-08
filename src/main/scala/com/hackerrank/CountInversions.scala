package com.hackerrank

import scala.collection.mutable.ListBuffer

object CountInversions {

  def countInversions(arr: Array[Int]): Long = {
    val n = arr.length
    var res = 0
    val listBuffer = ListBuffer[Int]()
    listBuffer.append(arr: _*)
    for (i <- 1 to n - 1) {
      val prev = listBuffer(i - 1)
      val curr = listBuffer(i)
      if (curr < prev) {
        var j = i - 1
        while (j >= 0 && listBuffer(j) > curr) {
          j -= 1
        }
        listBuffer.remove(i)
        val newIndex = j + 1
        listBuffer.insert(newIndex, curr)
        res +=  i - newIndex
      }
    }
    res
  }

}
