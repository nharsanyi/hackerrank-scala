package com.leetcode

import com.core.ListNode

object MergeTwoSortedList {

  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    var resultPointer: ListNode = null
    var resultHead: ListNode = null
    var l1 = list1
    var l2 = list2
    while (l1 != null && l2 != null) {
      val h1 = l1.x
      val h2 = l2.x

      if (h1 < h2) {
        val newNode = new ListNode(h1)
        if (resultPointer == null) {
          resultPointer = newNode
          resultHead = resultPointer
        } else {
          resultPointer.next = newNode
          resultPointer = resultPointer.next
        }
        l1 = l1.next
      } else {
        val newNode = new ListNode(h2)
        if (resultPointer == null) {
          resultPointer = newNode
          resultHead = resultPointer
        } else {
          resultPointer.next = newNode
          resultPointer = resultPointer.next
        }
        l2 = l2.next
      }
    }
    while (l1 != null) {
      val newNode = new ListNode(l1.x)
      if (resultPointer == null) {
        resultPointer = newNode
        resultHead = resultPointer
      } else {
        resultPointer.next = newNode
        resultPointer = resultPointer.next
      }
      l1 = l1.next
    }
    while (l2 != null) {
      val newNode = new ListNode(l2.x)
      if (resultPointer == null) {
        resultPointer = newNode
        resultHead = resultPointer
      } else {
        resultPointer.next = newNode
        resultPointer = resultPointer.next
      }
      l2 = l2.next
    }
    resultHead
  }

}
