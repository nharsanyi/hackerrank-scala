package com.leetcode

object TwoSumII {

  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {

    val n = numbers.length

    def binarySearch(left: Int, right: Int, item: Int): Int = {
      if (left <= right) {
        val midIndex = (left + right) / 2
        val mid = numbers(midIndex)
        if (item < mid) {
          return binarySearch(left, midIndex - 1, item)
        } else if (item > mid) {
          return binarySearch(midIndex + 1, right, item)
        } else {
          return midIndex
        }
      }
      -1
    }

    def solve(): Array[Int] = {
      for (i <- 0 to n - 1) {
        val curr = numbers(i)
        val diff = target - curr
        val diffIndex = binarySearch(i + 1, n - 1, diff)
        if (diffIndex != -1) {
          return Array(i + 1, diffIndex + 1)
        }
      }
      Array()
    }
    solve()
  }
}
