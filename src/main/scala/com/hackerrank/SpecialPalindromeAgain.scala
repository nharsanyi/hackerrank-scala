package com.hackerrank

import scala.collection.mutable.ListBuffer

object SpecialPalindromeAgain {

  def substrCount(n: Int, s: String): Long = {
    val occ = Array.ofDim[Int](n)
    var result = 0l
    var prev: Char = '0'
    var index = -1
    val uniqueChars = new StringBuilder("")
    for (i <- 0 to n - 1) {
        val curr = s.charAt(i)
        if (i == 0 || curr != prev) {
          index += 1
          prev = curr
          uniqueChars.append(prev)
        }
      occ(index) += 1
    }
    for (i <- 0 to uniqueChars.length - 1) {
      result += (occ(i) * (occ(i) + 1)) / 2
    }
    for (i <- 1 to uniqueChars.length - 2) {
      if (occ(i) == 1 && uniqueChars.charAt(i - 1) == uniqueChars.charAt(i + 1)) {
        result += math.min(occ(i - 1), occ(i + 1))
      }
    }
    result
  }


  case class SubStr(char: Char, occ: Long)
  def substrCount_NonOpt(n: Int, s: String): Long = {

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
