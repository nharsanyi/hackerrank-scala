package com.hackerrank

object BreakingBestAndWorstRecords {

  def breakingRecords(scores: Array[Int]): Array[Int] = {
    // Write your code here
    var currentMin = scores.head
    var currentMax = scores.head

    var breakMin = 0
    var breakMax = 0

    val n = scores.length
    for (i <- 1 to n -1) {
      val score = scores(i)
      if (score > currentMax) {
        currentMax = score
        breakMax += 1
      }
      if (score < currentMin) {
        currentMin = score
        breakMin += 1
      }
    }
    Array(breakMin, breakMax)

  }
}
