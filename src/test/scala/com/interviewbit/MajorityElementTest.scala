package com.interviewbit

import org.scalatest.FunSuite

class MajorityElementTest extends FunSuite {

  test("should calculate majorityElement") {
    val input = Array(2, 1, 2)
    assertResult(2)(MajorityElement.majorityElement(input))
  }
}
