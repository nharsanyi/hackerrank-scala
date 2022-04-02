package com.interviewbit

import org.scalatest.FunSuite

class QuickSortTest extends FunSuite {

  test("sort if not sorted") {
    val input = Array(1, 5, 2, 3, 4, 8, 8, 9, 3)
    QuickSort.sort(input)
    assertResult(Array(1, 2, 3, 3, 4, 5, 8, 8, 9))(input)
  }

  test("sort if sorted asc") {
    val input = Array(1, 5, 8, 8, 9)
    QuickSort.sort(input)
    assertResult(Array(1, 5, 8, 8, 9))(input)
  }

  test("sort if sorted desc") {
    val input = Array(10, 8, 7, 5, 4, 3, 2, -1, -10)
    QuickSort.sort(input)
    assertResult(Array(-10, -1, 2, 3, 4, 5, 7, 8, 10))(input)
  }

  test("sort if all element is the same") {
    val input = Array(1, 1, 1, 1, 1)
    QuickSort.sort(input)
    assertResult(Array(1, 1, 1, 1, 1))(input)
  }

  test("sort if empty") {
    val input = Array.empty[Int]
    QuickSort.sort(input)
    assertResult(Array())(input)
  }
}
