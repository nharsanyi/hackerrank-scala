package com.interviewbit

object MinStepsInInfiniteGrid {

  def coverPoints(A: Array[Int], B: Array[Int]): Int  = {
    val n = A.length
    var prevX = A(0)
    var prevY = B(0)
    var result = 0
    for (i <- 1 to n - 1) {
      val currX = A(i)
      val currY = B(i)
      if (math.abs(currX - prevX) <= math.abs(currY - prevY)) {
        result += math.abs(currY - prevY)
      } else {
        result += math.abs(currX - prevX)
      }
      prevX = currX
      prevY = currY
    }
    result
  }

  def minDistanceRec(x1: Int, y1: Int, x2: Int, y2: Int): Int = {
    if (x1 == x2 && y1 == y2) {
      return 0
    }
    var currMin =Int.MaxValue
    if (x1 < x2) {
      // move up
      currMin = math.min(currMin, minDistanceRec(x1 + 1, y1, x2, y2) + 1)
    }
    if (x1 > x2) {
      // move down
      currMin = math.min(currMin, minDistanceRec(x1 - 1, y1, x2, y2) + 1)
    }
    if (y2 < y1) {
      // move left
      currMin = math.min(currMin, minDistanceRec(x1, y1 - 1, x2, y2) + 1)
    }
    if (y1 < y2) {
      // move right
      currMin = math.min(currMin, minDistanceRec(x1, y1 + 1, x2, y2) + 1)
    }
    if (x1 < x2 && y1 < y2) {
      // move top-right
      currMin = math.min(currMin, minDistanceRec(x1 + 1, y1 + 1, x2, y2) + 1)
    }
    if (x1 < x2 && y2 < y1) {
      // move top-left
      currMin = math.min(currMin, minDistanceRec(x1 + 1, y1 - 1, x2, y2) + 1)
    }
    if (x2 < x1 && y1 < y2) {
      // move down-right
      currMin = math.min(currMin, minDistanceRec(x1 - 1, y1 + 1, x2, y2) + 1)
    }
    if (x2 < x1 && y2 < y1) {
      // move down-left
      currMin = math.min(currMin, minDistanceRec(x1 - 1, y1 - 1, x2, y2) + 1)
    }
    currMin
  }
}
