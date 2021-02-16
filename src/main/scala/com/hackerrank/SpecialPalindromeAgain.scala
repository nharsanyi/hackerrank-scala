package com.hackerrank

import scala.collection.mutable.ListBuffer

object SpecialPalindromeAgain {

  case class SubStr(char: Char, occ: Long)
  def substrCount(n: Int, s: String): Long = {

    val buffer = new ListBuffer[SubStr]()

    var prev =  s.charAt(0)
    var counter = 1l
    for (i <- 1 to n - 1) {
      val curr = s.charAt(i)
      if (curr == prev) {
        counter += 1
      } else {
        buffer.append(SubStr(prev, counter))
        prev = curr
        counter = 1l
      }
    }
    buffer.append(SubStr(prev, counter))

    var result = 0l
    val bufferSize = buffer.length
    for (i <- 0 to bufferSize - 3) {
      val curr = buffer(i)
      val nextAfter = buffer(i + 2)
      result += curr.occ

      if (nextAfter.char == curr.char) {
        result += math.min(curr.occ, nextAfter.occ)
      }
    }

    if (bufferSize > 1) {
      val lastBefore = buffer(bufferSize - 2).occ
      result += ((1 + lastBefore) * lastBefore) / 2
    }

    val last = buffer(bufferSize - 1).occ
    result += ((1 + last)  * last) / 2
    result
  }


}
