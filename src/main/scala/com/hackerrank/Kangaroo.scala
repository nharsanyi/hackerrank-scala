package com.hackerrank

object Kangaroo {

  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    // Write your code here
    var fast = math.max(v1, v2)


    var fasterLoc = if (math.max(v1, v2) == v1) x1 else x2
    var slowerLoc = if (math.min(v1, v2) == v1) x1 else x2
    var fastV = math.max(v1, v2)
    var slowV = math.min(v1, v2)

    while (fasterLoc < slowerLoc) {
      fasterLoc = fasterLoc + fastV
      slowerLoc = slowerLoc + slowV
    }
    if (fasterLoc == slowerLoc) "YES" else "NO"

  }

}
