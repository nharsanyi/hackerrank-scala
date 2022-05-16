package com.leetcode

import org.scalatest.FunSuite

class MinCostClimbingStairsTest extends FunSuite {

  test("should calculate min cost input 1") {
    assertResult(15)(MinCostClimbingStairs.minCostClimbingStairs(Array(10,15,20)))
  }

  test("should calculate min cost input 2") {
    assertResult(6)(MinCostClimbingStairs.minCostClimbingStairs(Array(1,100,1,1,1,100,1,1,100,1)))
  }
}
