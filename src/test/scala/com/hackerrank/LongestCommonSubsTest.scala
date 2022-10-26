package com.hackerrank

import org.scalatest.FunSuite

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class LongestCommonSubsTest extends FunSuite {

  test("test1") {
    val map = new mutable.HashMap[Int, Array[Int]]()
    val b = new ListBuffer[Int]
    b.append()
    assertResult(3)(LongestCommonSubs.longestCommonSubsequence("abcde", "ace"))
  }

}
