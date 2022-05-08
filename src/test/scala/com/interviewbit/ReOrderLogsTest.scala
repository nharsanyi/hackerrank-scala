package com.interviewbit

import org.scalatest.FunSuite

class ReOrderLogsTest extends FunSuite {

  test("should reorder logs input 1") {
    val input = Array("dig1-8-1-5-1", "let1-art-can", "dig2-3-6", "let2-own-kit-dig", "let3-art-zero")
    assertResult(Array("let1-art-can", "let3-art-zero", "let2-own-kit-dig", "dig1-8-1-5-1", "dig2-3-6"))(ReOrderLogs.reorderLogs(input))
  }

  test("should reorder logs input 2") {
    val input = Array("a1-9-2-3-1","g1-act-car","zo4-4-7","ab1-off-key-dog","a8-act-zoo")
    assertResult(Array("g1-act-car", "a8-act-zoo", "ab1-off-key-dog", "a1-9-2-3-1", "zo4-4-7"))(ReOrderLogs.reorderLogs(input))
  }

  test("should reorder logs if no letter log") {
    val input = Array("a1-9-2-3-1","zo4-4-7")
    assertResult(Array("a1-9-2-3-1", "zo4-4-7"))(ReOrderLogs.reorderLogs(input))
  }

  test("should reorder logs if no digit log") {
    val input = Array("g1-act-car", "ab1-off-key-dog","a8-act-zoo")
    assertResult(Array("g1-act-car", "a8-act-zoo", "ab1-off-key-dog"))(ReOrderLogs.reorderLogs(input))
  }
}
