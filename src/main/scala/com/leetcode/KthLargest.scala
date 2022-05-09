package com.leetcode

import scala.collection.mutable

class KthLargest(_k: Int, _nums: Array[Int]) {

  val queue = mutable.PriorityQueue.from(_nums)(Ordering.Int.reverse)
  while (queue.size > _k) {
    queue.dequeue()
  }

  def add(`val`: Int): Int = {
    // 2, 3, 4, 5, 8 -> 4
    // 2, 3, 4, 5, 5, 8 -> 5
    // 2, 3, 4, 5, 5, 8, 10 -> 5
    // 2, 3, 4, 5, 5, 8, 9, 10 -> 8
    // 2, 3, 4, 4, 5, 5, 8, 9, 10 -> 8
    queue.enqueue(`val`)
    while (queue.size > _k) {
      queue.dequeue()
    }
    queue.head
  }

}
