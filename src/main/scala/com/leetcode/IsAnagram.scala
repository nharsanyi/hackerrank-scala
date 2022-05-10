package com.leetcode

object IsAnagram {

  def isAnagram(s: String, t: String): Boolean = {
    val buffer = Array.fill[Int](256)(0)
    val n = s.length
    if (n != t.length) {
      return false
    }
    for (c <- s.toCharArray) {
      buffer(c) = buffer(c) + 1
    }
    for (c <- t.toCharArray) {
      val sc = buffer(c)
      if (sc < 1) {
        return false
      }
      buffer(c) = sc - 1
    }
    for (i <- buffer) {
      if (i != 0) {
        return false
      }
    }
    true
  }

}
