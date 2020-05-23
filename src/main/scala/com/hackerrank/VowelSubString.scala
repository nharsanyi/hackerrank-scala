package com.hackerrank

object VowelSubString {

  val VOWELS = Array('a', 'e', 'i', 'o', 'u')

  def findSubstring(s: String, k: Int): String = {
    var startIndex = getFirstVowelAfter(-1, s)
    if (startIndex == Integer.MAX_VALUE) {
      "Not found!"
    } else {
      val n = s.length
      var maxLength = Integer.MIN_VALUE
      var subs = ""

      while (startIndex + k <= n) {
        var counter = 0
        for (j <- startIndex to startIndex + k - 1) {
          val currentChar = s.charAt(j)
          if (VOWELS.contains(currentChar)) {
            counter += 1
          }
        }
        if (counter > maxLength) {
          maxLength = counter
          subs = s.substring(startIndex, startIndex + k)
        }
        startIndex = getFirstVowelAfter(startIndex, s)
      }
      if (maxLength == Integer.MIN_VALUE) "Not found!" else subs
    }
  }

  def getFirstVowelAfter(index: Int, s: String): Int = {
    var i: Int = index + 1
    while (i < s.length && !VOWELS.contains(s.charAt(i))) {
      i += 1
    }
    if (i < s.length) i else Integer.MAX_VALUE
  }

}
