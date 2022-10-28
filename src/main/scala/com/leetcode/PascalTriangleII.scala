package com.leetcode

import scala.collection.mutable.ListBuffer

object PascalTriangleII {

  def getRow(rowIndex: Int): List[Int] = {

    var prevRow = List[Int]()

    def solve(n: Int): List[Int] = {
      if (n == 0) {
        return List(1)
      }
      prevRow = solve(n - 1)
      val result = ListBuffer.empty[Int]
      // n = 2 prevRow = (1, 1) -> (1, 2, 1)
      result.addOne(1)
      for (i <- 1 to n - 1) { // 1 to 1
        result.addOne(prevRow(i - 1) + prevRow(i))
      }
      result.addOne(1)
      result.toList
    }
    solve(rowIndex)
  }

}
