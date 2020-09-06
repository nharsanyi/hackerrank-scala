package com.hackerrank

import org.scalatest.FunSuite

class RansomNoteTest extends FunSuite {

  test("testCheckMagazine 1") {
    val magazine = "give me one grand today night".split(" ")
    val note =  "give one grand today".split(" ")

    assert(RansomNote.checkMagazine(magazine, note))
  }

  test("testCheckMagazine 2") {
    val magazine = "two times three is not four".split(" ")
    val note =  "two times two is four".split(" ")

    assert(!RansomNote.checkMagazine(magazine, note))
  }

  test("testCheckMagazine 3") {
    val magazine = "ive got a lovely bunch of coconuts".split(" ")
    val note =  "ive got some coconuts".split(" ")

    assert(!RansomNote.checkMagazine(magazine, note))
  }

}
