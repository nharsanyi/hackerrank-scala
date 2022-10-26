package com.hackerrank

import org.scalatest.FunSuite

class EncodingTest extends FunSuite {

  test("test1") {
    assertResult("fto ehg ee dd")(Encoding.encryption("feedthedog"))
  }

  test("test2") {
    assertResult("clu hlt io")(Encoding.encryption("chillout"))
  }

}
