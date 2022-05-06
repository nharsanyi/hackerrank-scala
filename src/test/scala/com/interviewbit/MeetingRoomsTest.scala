package com.interviewbit

import org.scalatest.FunSuite

class MeetingRoomsTest extends FunSuite {

  test("should return meeting rooms") {
    val input = Array(
      Array(0, 30),
      Array(5, 10),
      Array(15, 20)
    )
    assertResult(2)(MeetingRooms.solve(input))
  }

  test("should return meeting rooms 2") {
    val input = Array(
      Array(1, 18),
      Array(18, 23),
      Array(15, 29),
      Array(4, 15),
      Array(2, 11),
      Array(5, 13)
    )
    assertResult(4)(MeetingRooms.solve(input))
  }

  test("should return meeting rooms 3") {
    val input = Array(
      Array(45, 60),
      Array(1, 18),
      Array(23, 29),
      Array(18, 23),
      Array(29, 35),
      Array(75, 130)
    )
    assertResult(1)(MeetingRooms.solve(input))
  }

  test("should return meeting rooms 4") {
    val input = Array(
      Array(14, 27),
      Array(6, 23)
    )
    assertResult(2)(MeetingRooms.solve(input))
  }
}
