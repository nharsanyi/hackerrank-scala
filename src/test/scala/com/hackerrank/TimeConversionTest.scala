package com.hackerrank

import org.scalatest.FunSuite

class TimeConversionTest extends FunSuite {

  test("testTimeConversion") {
    assertResult("19:05:45")(TimeConversion.timeConversion("07:05:45PM"))
  }

  test("testTimeConversion2") {
    assertResult("01:05:45")(TimeConversion.timeConversion("01:05:45AM"))
  }

  test("testTimeConversion3") {
    assertResult("00:00:00")(TimeConversion.timeConversion("12:00:00AM"))
  }

  test("testTimeConversion4") {
    assertResult("12:00:00")(TimeConversion.timeConversion("12:00:00PM"))
  }

}
