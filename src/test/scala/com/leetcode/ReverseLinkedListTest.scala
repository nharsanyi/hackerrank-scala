package com.leetcode

import com.core.ListNode
import org.scalatest.FunSuite

class ReverseLinkedListTest extends FunSuite {

  test("should reverse input 1") {
    val input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))))
    var expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, null)))))
    var result = ReverseLinkedList.reverseList(input)
    while (result != null) {
      assertResult(result.x)(expected.x)

      result = result.next
      expected = expected.next
    }
  }

  test("should reverse input 2") {
    val input = new ListNode(1, new ListNode(2, null))
    var expected = new ListNode(2, new ListNode(1, null))
    var result = ReverseLinkedList.reverseList(input)
    while (result != null) {
      assertResult(result.x)(expected.x)

      result = result.next
      expected = expected.next
    }
  }

  test("should reverse input 3") {
    val input = new ListNode(1, null)
    var expected = new ListNode(1, null)
    var result = ReverseLinkedList.reverseList(input)
    while (result != null) {
      assertResult(result.x)(expected.x)

      result = result.next
      expected = expected.next
    }
  }
}
