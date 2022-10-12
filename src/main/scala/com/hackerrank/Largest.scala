package com.hackerrank

object Largest {

  def get2ndLargest(array: Array[Int]): Int = {
    var largest = math.max(array(0), array(1))
    var secondLargest = math.min(array(0), array(1))
    val n = array.length
    for (i <- 2 to n - 1) {
      val curr = array(i)
      if (curr > largest) {
        secondLargest = largest
        largest = curr
      } else if (curr == largest) {
        secondLargest = curr
      } else if (curr > secondLargest) {
        secondLargest = curr
      }
    }
    secondLargest
  }

}
