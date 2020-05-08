package com.hackerrank

object HourglassSum {

  def hourglassSum(arr: Array[Array[Int]]): Int = {

    var max = Integer.MIN_VALUE

    for (row <- 0 to 3) {
      for (col <- 0 to 3) {
        var currSum = 0
        // CURR ROW
        currSum += arr(row)(col) + arr(row)(col + 1) + arr(row)(col + 2)
        // MID ROW
        currSum += arr(row + 1)(col + 1)
        // BOTTOM ROW
        currSum += arr(row + 2)(col) + arr(row + 2)(col + 1) + arr(row + 2)(col + 2)
        max = math.max(currSum, max)
      }
    }
    max
  }

}
