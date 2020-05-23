package com.hackerrank

object SherlockAndValidString {

  def isValid(s: String): String = {
    val buffer = Array.fill(256)(0)
    for (c <- s.toCharArray) {
      buffer(c) += 1
    }

    var nr1 = 0
    var nr2 = 0

    for (count <- buffer) {
      if (count != 0) {
        if (nr1 == 0 || nr1 == count) {
          nr1 = count
        } else if (nr2 == 0 && (math.abs(count - nr1) == 1 || count == 1)) {
          nr2 = count
        } else {
          return "NO"
        }
      }
    }
    return "YES"
  }

}
