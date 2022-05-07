package com.interviewbit

import org.scalatest.FunSuite

class MinStepsInInfiniteGridTest extends FunSuite {

  test("should calculate minDistance 1") {
    val A: Array[Int] = Array(0, 1, 1)
    val B: Array[Int] = Array(0, 1, 2)

    assertResult(2)(MinStepsInInfiniteGrid.coverPoints(A, B))
  }
}
