package com.hackerrank

object ClimbingLeaderBoard {

  def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val n = scores.length
    val m = alice.length
    val result = Array.ofDim[Int](m)
    for (j <- 0 to m - 1) {
      val current = alice(j)
      var currentPos = n
      currentPos = findPos(current, scores, currentPos)
      result(j) = currentPos
    }
    result
  }

  private def findPos(current: Int, scores: Array[Int], lastPos: Int): Int = {
    var i = 0
    var k = 0
    while (i < lastPos && scores(i) > current) {
      if ((i > 0  && scores(i - 1) > scores(i)) || i == 0) k += 1
      i += 1
    }
    k + 1
  }
}
