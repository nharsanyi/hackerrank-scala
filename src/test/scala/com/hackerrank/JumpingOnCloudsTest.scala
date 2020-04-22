package com.hackerrank

import org.scalatest.FunSuite

class JumpingOnCloudsTest extends FunSuite {

  test("should calculate min jumps") {
    assertResult(4)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 0)))
    assertResult(6)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0)))
    assertResult(28)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0)))
  }
}
