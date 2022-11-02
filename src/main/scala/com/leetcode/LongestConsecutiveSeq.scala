package com.leetcode

import scala.collection.mutable

object LongestConsecutiveSeq {

  def longestConsecutive(nums: Array[Int]): Int = {
    val unique = new mutable.HashSet[Int]()
    for (num <- nums) {
      unique += num
    }
    var longest = 0
    for (n <- nums) {
      if (!unique.contains(n - 1)) { // O(1) - check if this is the beginning of the sequence
        var length = 1
        while (unique.contains(n + length)) length += 1
        longest = math.max(length, longest)
      }
    }
    longest

  }
}
