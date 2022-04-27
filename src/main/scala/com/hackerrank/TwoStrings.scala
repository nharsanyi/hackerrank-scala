package com.hackerrank

import scala.collection.immutable.HashSet

object TwoStrings {

  def twoStrings(s1: String, s2: String): String = {
    var lettersS1 = HashSet[Char]()
    var lettersS2 = HashSet[Char]()
    val n = s1.size - 1
    val m = s2.size - 1
    for (i <- 0 to n) {
      lettersS1 += s1.charAt(i)
    }
    for (i <- 0 to m) {
      lettersS2 += s2.charAt(i)
    }

    val commonLetters = lettersS1.intersect(lettersS2)
    if (commonLetters.isEmpty) "NO" else "YES"
  }

  def twoStringsLessOptimal(s1: String, s2: String): String = {
    var words = HashSet[String]()
    val n = s1.size
    for (i <- 0 to n - 1) {
      val subString = new StringBuilder(s1.charAt(i) + "")
      words = words + subString.mkString
      for (j <- i + 1 to n - 1) {
        subString.+(s1.charAt(j).toString)
        words = words + subString.mkString
      }
    }
    val m = s2.size
    for (i <- 0 to m - 1) {
      val subString = new StringBuilder(s2.charAt(i) + "")
      if (words.contains(subString.mkString)) {
        return "YES"
      }
      for (j <- i + 1 to m - 1) {
        subString.+(s2.charAt(j).toString)
        if (words.contains(subString.mkString)) {
          return "YES"
        }
      }
    }
    "NO"
  }

}
