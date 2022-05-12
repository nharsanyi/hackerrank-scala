package com.leetcode

import scala.collection.immutable.HashSet
import scala.collection.mutable

object LengthOfLongestSubString {

  def lengthOfLongestSubstring(s: String): Int = {
    val n = s.length
    val set = mutable.Set.empty[Char]
    var maxLength = 0
    var left = 0
    var right = 0
    while (right < n) {
      if (!set.contains(s.charAt(right))) {
        set.add(s.charAt(right))
        right += 1
      } else {
        set.remove(s.charAt(left))
        left += 1
      }
      maxLength = math.max(maxLength, right - left)
    }
    maxLength
  }
}
