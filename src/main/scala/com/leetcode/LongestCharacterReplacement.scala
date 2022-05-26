package com.leetcode


import scala.collection.mutable

object LongestCharacterReplacement {

  def characterReplacement(s: String, k: Int): Int = {
    val charMap = mutable.HashMap.empty[Char, Int]
    var windowStart = 0
    var result = 0
    for (windowEnd <- 0 to s.length - 1) {
      val endC = s.charAt(windowEnd)
      charMap += (endC -> (charMap.getOrElse(endC, 0) + 1))
      while (((windowEnd - windowStart + 1) - charMap.values.max) > k) {
        val startC = s.charAt(windowStart)
        charMap += startC -> (charMap.get(startC).get - 1)
        windowStart += 1
      }
      result = math.max(result, windowEnd - windowStart + 1)
    }
    result
  }

}
