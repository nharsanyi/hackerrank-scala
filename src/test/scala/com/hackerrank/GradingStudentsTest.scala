package com.hackerrank

import org.scalatest.FunSuite

class GradingStudentsTest extends FunSuite {

  test("testGradingStudents") {
    val input = Array(73, 67, 38, 33)
    val expected = Array(75, 67, 40, 33)
    assertResult(expected)(GradingStudents.gradingStudents(input))
  }

}
