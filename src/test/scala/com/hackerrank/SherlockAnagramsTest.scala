package com.hackerrank

import org.scalatest.FunSuite

class SherlockAnagramsTest extends FunSuite {

  test("should count anagrams") {
    val s = "ifailuhkqq"
    assertResult(3)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

  test("should count anagrams 2") {
    val s = "kkkk"
    assertResult(10)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

  test("should count anagrams 3") {
    val s = "abba"
    assertResult(4)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

  test("should count anagrams 4") {
    val s = "abcd"
    assertResult(0)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

  test("should count anagrams 5") {
    val s = "cdcd"
    assertResult(5)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

  test("should count anagrams 6") {
    val s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
    assertResult(166650)(SherlockAnagrams.sherlockAndAnagrams(s))
  }

}
