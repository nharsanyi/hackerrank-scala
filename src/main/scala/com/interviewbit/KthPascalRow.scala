package com.interviewbit

object KthPascalRow {

  def getRow(k: Int): Array[Int]  = {
    if (k == 0) {
      return Array(1)
    }
    val previousRow = getRow(k - 1)
    val n = previousRow.length
    val newLength = n + 1
    val result = Array.fill[Int](newLength)(1)
    //    1         k == 0
    //   1 1        k == 1
    //  1 2 1       k == 2
    // 1 3 3 1      k == 3
    //1 4 6 4 1     k == 4
    for (i <- 1 to (newLength / 2) - 1) {
      result(i) = previousRow(i - 1) + previousRow(i)
      result(newLength - i - 1) = result(i) // symmetrical
    }
    if (newLength % 2 == 1) {
      val midIndex = (newLength / 2)
      result(midIndex) = previousRow(midIndex - 1) + previousRow(midIndex)
    }
    return result
  }

}
