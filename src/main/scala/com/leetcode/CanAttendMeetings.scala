package com.leetcode

import com.core.Interval


object CanAttendMeetings {

  def canAttendMeetings(intervals: Array[Interval]): Boolean = {
//    val sorted = intervals.sortWith((i1, i2) => i2.start.compareTo(i1.start) > 0)
    var prevEnd = intervals(0).`end`
    for (i <- 1 to intervals.length - 1) {
      val curr = intervals(i)
      if (curr.start < prevEnd) {
        return false
      }
      prevEnd = curr.`end`
    }
    true
  }
}
