package com.meta

object Cafeteria {

  def getMaxAdditionalDinersCount(N: Long, K: Long, M: Int, S: Array[Long]): Long = {
    // Write your code here

    def calculate_seats(start: Long, end: Long, step_size: Long): Long = {
      if (end < 0) return 0
      val diff = end - start
      if (diff > 0) {
        return diff / step_size + 1
      } else if (diff == 0) {
        return 1
      }
      0
    }

    val seats = S.sorted
    var res: Long = 0

    val seatOcc: Long = K + 1
    var start: Long = 1
    var end: Long = 0
    for (j <- 0 to M - 1) {
      end = seats(j) - seatOcc
      res += calculate_seats(start, end, seatOcc)
      start = seats(j) + seatOcc
    }
    res += calculate_seats(start, N, seatOcc)
    res
  }
}
