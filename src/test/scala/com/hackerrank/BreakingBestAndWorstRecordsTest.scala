package com.hackerrank

import org.scalatest.FunSuite

class BreakingBestAndWorstRecordsTest extends FunSuite {

  test("should return result 1") {
    val input = Array(12, 24, 10, 24)
    assertResult(Array(1, 1))(BreakingBestAndWorstRecords.breakingRecords(input))
  }

  test("should return result 2") {
    val input = Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)
    assertResult(Array(0, 4))(BreakingBestAndWorstRecords.breakingRecords(input))
  }

  test("should return result if only 1 element") {
    val input = Array(3)
    assertResult(Array(0, 0))(BreakingBestAndWorstRecords.breakingRecords(input))
  }

}
