package com.interviewbit

import scala.util.control.Breaks._

import scala.collection.mutable.PriorityQueue

object MeetingRooms {

  def solve(A: Array[Array[Int]]): Int  = {
    val minHeap = PriorityQueue[Int]()(Ordering[Int].reverse)
    val n = A.length
    val sorted = A.sortWith(_.head < _.head)
    minHeap.enqueue(sorted(0)(1))
    for (i <- 1 to n - 1) {
      val a = sorted(i)
      println(s"Top: ${minHeap.head}, current start time = ${a(0)}, current end time = ${a(1)}, heap size = ${minHeap.size}")
      if (a(0) >= minHeap.head) {
        println("Remove head")
        minHeap.dequeue()
      }
      minHeap.enqueue(a(1))
    }
    minHeap.size
  }
}
