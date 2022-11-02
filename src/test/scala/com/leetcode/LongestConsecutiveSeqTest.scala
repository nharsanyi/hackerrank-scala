package com.leetcode

import org.scalatest.FunSuite

class LongestConsecutiveSeqTest extends FunSuite {


  test("should return result") {
    assertResult(4)(LongestConsecutiveSeq.longestConsecutive(Array(100,4,200,1,3,2)))
  }

  test("should return result 2") {
    assertResult(9)(LongestConsecutiveSeq.longestConsecutive(Array(0,3,7,2,5,8,4,6,0,1)))
  }

}
