package com.leetcode

import org.scalatest.FunSuite
import com.core.Interval

class CanAttendMeetingsTest extends FunSuite {

  test("should return result for input 1") {
    // (0,30),(5,10),(15,20)
    val input = Array(new Interval(0, 30), new Interval(5, 10), new Interval(15, 20))
    assertResult(false)(CanAttendMeetings.canAttendMeetings(input))
  }

  test("should return result for input 2") {
    // (5,8),(9,15)
    val input = Array(new Interval(5, 8), new Interval(9, 15), new Interval(15, 20))
    assertResult(true)(CanAttendMeetings.canAttendMeetings(input))
  }


  test("should return result for input 3") {
    // (5,8)
    val input = Array(new Interval(5, 8))
    assertResult(true)(CanAttendMeetings.canAttendMeetings(input))
  }
}
