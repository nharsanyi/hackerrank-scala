package com.leetcode

object PermutationInString {
  /**
    * hint: create chars table for the string we are trying to find
    * and for s2 the current window. As we move the window, we have to update
    * the current window character counts. If all the characters have a matching
    * number, we are done
    *
    * @param s1
    * @param s2
    * @return
    */
  def checkInclusion(s1: String, s2: String): Boolean = {
    var charsS1 = Array.fill[Int](26)(0)
    var windowTable = Array.fill[Int](26)(0)
    val windowSize = s1.size
    val n = s2.size
    if (windowSize > n) return false

    for (i <- 0 to windowSize - 1) {
      charsS1(s1.charAt(i) - 'a') += 1
      windowTable(s2.charAt(i) - 'a') += 1
    }
    var matching = 0
    for (i <- 0 to 25) {
      if (charsS1(i) == windowTable(i)) {
        matching += 1
      }
    }
    var l = 0
    for (r <- windowSize to n - 1) {
      if (matching == 26) return true
      // added
      val ri = s2(r) - 'a'
      windowTable(ri) += 1
      if (windowTable(ri) == charsS1(ri)) {
        matching += 1
      } else if (windowTable(ri) == charsS1(ri) + 1)  { // they were the same before adding the new one
        matching -= 1
      }
      // removed
      val li = s2(l) - 'a'
      windowTable(li) -= 1
      if (windowTable(li) == charsS1(li)) {
        matching += 1
      } else if (windowTable(li) == charsS1(li) - 1)  { // they were the same before we removed it
        matching -= 1
      }
      l += 1
    }
    matching == 26
  }
}
