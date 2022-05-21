package com.leetcode

object Search2DMatrix {

  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    // every row asc left to right, every row 1st is bigger than the previous row last
    val n = matrix.length
    val m = matrix.head.length

    def findInRow(row: Array[Int], left: Int, right: Int): Boolean = {
      if (left <= right) {
        val midIndex = (left + right) / 2
        val mid = row(midIndex)
        if (target < mid) {
          return findInRow(row, left, midIndex - 1)
        } else if (target > mid) {
          return findInRow(row, midIndex + 1, right)
        } else {
          return true
        }
      }
      false
    }
    //  1  3   5   7
    // 10  11  16  20
    // 23  30  34  60
    def inner(matrix: Array[Array[Int]], left: Int, right: Int): Boolean = {
      if (left <= right) {
        val midIndex = (left + right) / 2
        val midHead = matrix(midIndex)(0)
        val midLast = matrix(midIndex).last
        if (target >= midHead && target <= midLast) {
          return findInRow(matrix(midIndex), 0, m - 1)
        } else if (target < midHead) {
          return inner(matrix, left, midIndex - 1)
        } else {
          return inner(matrix, midIndex + 1, right)
        }
      }
      false
    }
    inner(matrix, 0, n - 1)
  }


}
