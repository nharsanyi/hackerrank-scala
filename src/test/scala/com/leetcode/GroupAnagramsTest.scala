package com.leetcode

import org.scalatest.FunSuite

class GroupAnagramsTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array("eat","tea","tan","ate","nat","bat")
    val actual = GroupAnagrams.groupAnagrams(input).map(_.sorted)
    assert(actual.length == 3)
    assert(actual.contains(List("bat")))
    assert(actual.contains(List("nat","tan")))
    assert(actual.contains(List("ate","eat","tea")))
  }

  test("should return result for input 2") {
    val input = Array("")
    val actual = GroupAnagrams.groupAnagrams(input).map(_.sorted)
    assert(actual.length == 1)
    assert(actual.contains(List("")))
  }

  test("should return result for input 3") {
    val input = Array("a")
    val actual = GroupAnagrams.groupAnagrams(input).map(_.sorted)
    assert(actual.length == 1)
    assert(actual.contains(List("a")))
  }

  test("should return 2 result for input 1") {
    val input = Array("eat","tea","tan","ate","nat","bat")
    val actual = GroupAnagrams.groupAnagrams2(input).map(_.sorted)
    assert(actual.length == 3)
    assert(actual.contains(List("bat")))
    assert(actual.contains(List("nat","tan")))
    assert(actual.contains(List("ate","eat","tea")))
  }

  test("should return 2 result for input 2") {
    val input = Array("")
    val actual = GroupAnagrams.groupAnagrams2(input).map(_.sorted)
    assert(actual.length == 1)
    assert(actual.contains(List("")))
  }

  test("should return 2 result for input 3") {
    val input = Array("a")
    val actual = GroupAnagrams.groupAnagrams2(input).map(_.sorted)
    assert(actual.length == 1)
    assert(actual.contains(List("a")))
  }
}
