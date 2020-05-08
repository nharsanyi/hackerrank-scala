package com.hackerrank

object ArrayLeftRotation {

  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    val n = a.length
    val rot = d % n // do not rotate in circles multiple time
    // 1 2 3 4 5 -> 1 2 3 4 5 1 2 3 4 5
    (a ++ a).slice(rot, rot + n)
  }

}
