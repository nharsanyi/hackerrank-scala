package com.leetcode

import org.scalatest.FunSuite

class CarFleetTest extends FunSuite {

  /**
    * 12
[10,8,0,5,3]
[2,4,1,1,3]
    */
  test("should return result") {
    assertResult(3)(CarFleet.carFleet(12, Array(10,8,0,5,3), Array(2,4,1,1,3)))
  }


}
