package com.hackerrank

import org.scalatest.FunSuite

class PageCountTest extends FunSuite {

  test("test1") {
    assertResult(1)(PageCount.pageCount(6, 5))
  }

  test("test2") {
    assertResult(0)(PageCount.pageCount(5, 4))
  }

}
