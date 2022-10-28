package com.leetcode

import scala.collection.mutable.ListBuffer

object PascalTriangle {

  def generate(numRows: Int): List[List[Int]] = {

    val result = new ListBuffer[List[Int]]()

    def solve(n: Int): Unit = {
      if (n == 1) {
        result.addOne(List(1))
        return
      }
      solve(n - 1)
      val row = new ListBuffer[Int]()
      val prevRow = result(n - 1 - 1)
      row.addOne(1)
      for (i <- 1 to n - 2) {
        row.addOne(prevRow(i - 1) + prevRow(i))
      }
      row.addOne(1)
      result.addOne(row.toList)
    }

    solve(numRows)
    result.toList
  }

}
