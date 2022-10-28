package com.leetcode

import org.scalatest.FunSuite

class CoinChangeIITest extends FunSuite {
  /**
    * 5 [1,2,5]
    */
  test("should return result") {
    assertResult(4)(CoinChangeII.change(5, Array(1, 2, 5)))
  }


}
