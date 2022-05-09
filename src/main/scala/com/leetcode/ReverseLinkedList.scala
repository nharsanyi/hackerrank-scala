package com.leetcode

import com.core.ListNode

object ReverseLinkedList {

  def reverseList(head: ListNode): ListNode = {
    var curr = head
    var result: ListNode = null
    while (curr != null) {
      val newNode = new ListNode(curr.x, result)
      result = newNode
      curr = curr.next
    }
    result
  }

}
