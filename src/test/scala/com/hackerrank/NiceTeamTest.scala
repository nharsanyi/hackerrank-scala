package com.hackerrank

import org.scalatest.FunSuite

class NiceTeamTest extends FunSuite {

  test("test1") {
    val skillLevels = Array[Int](3, 4, 5, 2, 1)
    val minDiff = 3
    val expected = 3

    assertResult(expected)(NiceTeam.maxPairs(skillLevels, minDiff))
  }

  test("test2") {
    val skillLevels = Array[Int](1, 1, 1, 1)
    val minDiff = 1
    val expected = 0

    assertResult(expected)(NiceTeam.maxPairs(skillLevels, minDiff))
  }

  test("test3") {
    val skillLevels = Array[Int](1, 2, 3, 4, 5, 6)
    val minDiff = 4
    val expected = 3

    assertResult(expected)(NiceTeam.maxPairs(skillLevels, minDiff))
  }

}
