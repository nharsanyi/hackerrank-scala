package com.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object CarFleet {

  def carFleet(target: Int, position: Array[Int], speed: Array[Int]): Int = {
    var posSpeed = new ListBuffer[(Int, Int)]()
    var stack = new mutable.Stack[Float]()
    for (i <- 0 to position.size - 1) {
      posSpeed.append((position(i), speed(i)))
    }
    var sortedArr = posSpeed.toList.sortBy(_._1)(Ordering[Int].reverse)
    for ((pos, sp) <- sortedArr) {
      val reachTarget = ((target - pos).toFloat / sp)
      println(f"reachTarget=$reachTarget for $pos and speed=$sp")

      if (stack.isEmpty || reachTarget > stack.head) {
        stack.push(reachTarget)
      }

    }
    stack.size
  }

}
