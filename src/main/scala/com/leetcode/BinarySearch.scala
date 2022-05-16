package com.leetcode

object BinarySearch {

  def search(nums: Array[Int], target: Int): Int = {

    def inner(from: Int, to: Int): Int = {
      if (from <= to) {
        val midIndex = (from + to) / 2
        val mid = nums(midIndex)
        if (mid == target) {
          return midIndex
        }
        if (target < mid) {
          return inner(from, midIndex - 1)
        }
        return inner(midIndex + 1, to)
      }
      -1
    }
    inner(0, nums.length - 1)
  }
}
