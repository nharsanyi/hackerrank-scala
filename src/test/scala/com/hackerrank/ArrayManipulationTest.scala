package com.hackerrank

import org.scalatest.FunSuite

class ArrayManipulationTest extends FunSuite {

  test("should return max after array manipulation") {
    assertResult(200)(ArrayManipulation.arrayManipulation1(5, Array(Array(1, 2, 100), Array(2, 5, 100), Array(3, 4, 100))))
  }

  test("should return max after array manipulation 2") {
    assertResult(10)(ArrayManipulation.arrayManipulation1(10, Array(Array(1, 5, 3), Array(4, 8, 7), Array(6, 9, 1))))
  }

  test("should return solution 2 max after array manipulation") {
    assertResult(200)(ArrayManipulation.arrayManipulation2(5, Array(Array(1, 2, 100), Array(2, 5, 100), Array(3, 4, 100))))
  }

  test("should return solution 2 max after array manipulation 2") {
    assertResult(10)(ArrayManipulation.arrayManipulation2(10, Array(Array(1, 5, 3), Array(4, 8, 7), Array(6, 9, 1))))
  }

}
