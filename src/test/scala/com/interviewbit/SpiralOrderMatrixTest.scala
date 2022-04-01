package com.interviewbit

import org.scalatest.FunSuite

class SpiralOrderMatrixTest extends FunSuite {

  test("should spiral order square matrix") {
    assertResult(Array(1, 2, 3, 6, 9, 8, 7, 4, 5))(SpiralOrderMatrix.spiralOrder(Array(Array(1,2,3), Array(4,5,6), Array(7, 8, 9))))
  }

  test("should spiral order non-square matrix") {
    assertResult(Array(1, 2, 4, 6, 5, 3))(SpiralOrderMatrix.spiralOrder(Array(Array(1,2), Array(3,4), Array(5, 6))))
  }

  test("should spiral order non-square matrix 2") {
    assertResult(Array(1, 2, 3))(SpiralOrderMatrix.spiralOrder(Array(Array(1), Array(2), Array(3))))
  }

}
