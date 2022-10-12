package com.hackerrank

import org.scalatest.FunSuite

class LinkedListTest extends FunSuite {

  test("test1") {
    val list = new LinkedList()
    assertResult(0)(list.getSize())

    list.add(5)
    assertResult(1)(list.getSize())
    list.add(3)
    list.add(2)
    list.add(3)
    list.add(1)
    val size = list.getSize()
    assertResult(5)(size)
    assertResult(List(5, 3, 2, 3, 1))(list.toList())

    list.delete(2)
    assertResult(List(5, 3, 3, 1))(list.toList())
    assertResult(4)(list.getSize())

    assertResult(3)(list.get(2))

    list.delete(3)
    assertResult(List(5, 3, 3))(list.toList())
    assertResult(3)(list.getSize())

    list.deleteAll()
    assertResult(List())(list.toList())
    assertResult(0)(list.getSize())
  }
}
