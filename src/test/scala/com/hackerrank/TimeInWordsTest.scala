package com.hackerrank

import org.scalatest.FunSuite

class TimeInWordsTest extends FunSuite {

  test("testTimeInWords") {
    assertResult("five o' clock")(TimeInWords.timeInWords(5, 0))
    assertResult("one minute past five")(TimeInWords.timeInWords(5, 1))
    assertResult("ten minutes past five")(TimeInWords.timeInWords(5, 10))
    assertResult("quarter past five")(TimeInWords.timeInWords(5, 15))
    assertResult("half past five")(TimeInWords.timeInWords(5, 30))
    assertResult("twenty minutes to six")(TimeInWords.timeInWords(5, 40))
    assertResult("quarter to six")(TimeInWords.timeInWords(5, 45))
    assertResult("thirteen minutes to six")(TimeInWords.timeInWords(5, 47))
    assertResult("twenty eight minutes past five")(TimeInWords.timeInWords(5, 28))
  }

}
