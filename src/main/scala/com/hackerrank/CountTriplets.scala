package com.hackerrank

import scala.collection.immutable.HashMap

object CountTriplets {

  def countTriplets(arr: Array[Long], r: Long): Long = {
    if (arr.size < 3) return 0l
    val n = arr.size - 1
    var before = HashMap[Long, Long]()
    var after = HashMap[Long, Long]()

    for (i <- 0 to n) {
      val l = arr(i)
      after += (l -> (after.getOrElse(l, 0l) + 1))
    }
    var count = 0l
    for (i <- 0 to n - 1) {
      val curr = arr(i)
      // remove curr from after
      val oldNr = after.getOrElse(curr, 0l)
      if (oldNr < 2) {
        after -= curr
      } else {
        after += (curr -> (oldNr - 1))
      }
      if (curr % r == 0) {
        val b = curr / r
        val a = curr * r
        val cb = before.getOrElse(b, 0l)
        val ca = after.getOrElse(a, 0l)
        count += cb * ca
      }
      // move curr to the before
      before += curr -> (before.getOrElse(curr, 0l) + 1l)
    }
    count
  }

}
