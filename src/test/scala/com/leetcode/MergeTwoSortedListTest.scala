package com.leetcode

import com.core.ListNode
import org.scalatest.FunSuite

class MergeTwoSortedListTest extends FunSuite {

  test("should return result for input 1") {
    val list1 = new ListNode(1, new ListNode(2, new ListNode(4)))
    val list2 = new ListNode(1, new ListNode(3, new ListNode(4)))
    val expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))))
    assertResult(expected)(MergeTwoSortedList.mergeTwoLists(list1, list2))
  }

  test("should return result for input 2") {
    assertResult(null)(MergeTwoSortedList.mergeTwoLists(null.asInstanceOf[ListNode], null.asInstanceOf[ListNode]))
  }

  test("should return result if one list is empty") {
    val list1 = new ListNode(1, new ListNode(2, new ListNode(4)))
    val list2 = null
    val expected = new ListNode(1, new ListNode(2, new ListNode(4)))
    assertResult(expected)(MergeTwoSortedList.mergeTwoLists(list1, list2))
  }
}
