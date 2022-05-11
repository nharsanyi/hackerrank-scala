package com.leetcode

import com.core.ListNode

import scala.collection.mutable

object LinkedListCycle {
  def hasCycle(head: ListNode): Boolean = {
    val visited = new mutable.HashSet[ListNode]()
    var curr = head
    while (curr != null) {
      if (visited.contains(curr)) {
        return true
      }
      visited.add(curr)
      curr = curr.next
    }
    false
  }
}
