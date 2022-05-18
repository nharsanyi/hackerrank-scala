package com.leetcode

import scala.collection.mutable.ListBuffer

class MinStack() {
  val stack = ListBuffer.empty[Int]
  var currentMin = Int.MaxValue

  def push(`val`: Int) {
    if (`val` < currentMin) {
      currentMin = `val`
    }
    stack.addOne(`val`)
  }

  def pop() {
    val top = this.top()
    stack.remove(stack.size - 1)
    if (top  == currentMin) {
      recalculateMin
    }
  }

  private def recalculateMin = {
    currentMin = Int.MaxValue
    for (a <- stack) {
      currentMin = math.min(a, currentMin)
    }
  }

  def top(): Int = {
    stack(stack.size - 1)
  }

  def getMin(): Int = {
    currentMin
  }

}
