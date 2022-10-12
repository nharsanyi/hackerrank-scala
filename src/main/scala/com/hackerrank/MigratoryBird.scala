package com.hackerrank

object MigratoryBird {
  def migratoryBirds(arr: Array[Int]): Int = {
    // Write your code here
    val sorted = arr.sorted(Ordering[Int].reverse)
    var curr = sorted(0)
    var counter = 1
    var currMax = -1
    var maxType = curr
    for (i <- 1 to sorted.length - 1) {
      var a = sorted(i)
      if (a == curr) {
        counter = counter + 1
        println(counter)
      } else {
        if (counter >= currMax) {
          currMax = counter
          maxType = curr

        }
        counter = 1
        curr = a
      }
    }
    if (counter >= currMax) {
      maxType = curr
    }
    maxType
  }
}
