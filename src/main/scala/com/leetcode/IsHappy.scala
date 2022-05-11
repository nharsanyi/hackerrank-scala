package com.leetcode

import scala.collection.mutable

object IsHappy {


  def sumDigits(n: Int): Int = {
    var r = n
    var sum = 0
    while (r > 0) {
      val curr = r % 10
      sum += curr * curr
      r = r / 10
    }
    sum
  }

  def isHappy(n: Int): Boolean = {
    val visited = new mutable.HashSet[Long]()
    var r = n
    while (r != 1) {
      if (visited.contains(r)) {
        return false
      }
      visited.add(r)
      r = sumDigits(r)
    }
    true
  }
}
