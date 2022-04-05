package com.interviewbit

import org.scalatest.FunSuite

class PitagorianTripletTest extends FunSuite {

  test("should return the number of pitagorian triplets") {
    assertResult(1)(PitagorianTriplet.solve(5))
  }

  test("should return the number of pitagorian triplets 2") {
    assertResult(3)(PitagorianTriplet.solve(13))
  }

}
