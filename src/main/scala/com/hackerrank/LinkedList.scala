package com.hackerrank

import com.core.ListNode

import scala.collection.mutable.ListBuffer

class LinkedList() {

  private var _head: ListNode = null
  private var _size = 0

  def add(i: Int): Unit = {
    val newNode = new ListNode(i)
    if (_head == null) {
      _head = newNode
    } else {
      var lastNode = getIthNode(_size - 1)
      lastNode.setNext(newNode)
    }
    _size = _size + 1
  }

  def getSize(): Int = _size

  private def getIthNode(index: Int) = {
    var i = 0
    var tmpHead = _head
    while (i < index && tmpHead != null) {
      tmpHead = tmpHead.next
      i = i + 1
    }
    tmpHead
  }

  def get(index: Int): Int = {
    val node: ListNode = getIthNode(index)
    if (node == null) throw new ArrayIndexOutOfBoundsException(index) else node.x
  }

  def delete(index: Int) = {
    val prevNode = getIthNode(index - 1)
    if (prevNode == null || prevNode.next == null) throw new ArrayIndexOutOfBoundsException(index)
    val nextNode = prevNode.next
    prevNode.setNext(nextNode.next)
    _size = _size - 1
  }

  def toList(): List[Int] = {
    val listBuffer = ListBuffer[Int]()
    for (i <- 0 to _size - 1) {
      listBuffer.append(get(i))
    }
    listBuffer.toList
  }

  def deleteAll() = {
    _head = null
    _size = 0
  }

}
