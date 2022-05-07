package com.interviewbit

import org.scalatest.FunSuite

class MinimumLightsToActivateTest extends FunSuite {

  test("Should return minimum lights if exists") {
    val input = Array(0, 0, 1, 1, 1, 0, 0, 1)
    val B = 3
    assertResult(2)(MinimumLightsToActivate.solve(input, B))
  }

  test("Should return -1 lights if not exists") {
    val input = Array(0, 0, 0, 1, 0)
    val B = 3
    assertResult(-1)(MinimumLightsToActivate.solve(input, B))
  }

  test("Should return 0 lights if all are good") {
    val input = Array(1, 1, 1, 1)
    val B = 3
    assertResult(1)(MinimumLightsToActivate.solve(input, B))
  }

  test("Should return minimum lights 2") {
    val input = Array(0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0)
    val B = 12
    assertResult(2)(MinimumLightsToActivate.solve(input, B))
  }
}
