package com.core

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  def setNext(_next: ListNode): Unit = {
    next = _next
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[ListNode]

  override def equals(other: Any): Boolean = other match {
    case that: ListNode =>
      (that canEqual this) &&
        next == that.next &&
        x == that.x
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(next, x)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
