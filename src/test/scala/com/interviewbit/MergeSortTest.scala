package com.interviewbit

import org.scalatest.FunSuite

class MergeSortTest extends FunSuite {

  test("sort if not sorted") {
    val input = List(1, 5, 2, 3, 4, 8, 8, 9, 3)
    val sorted = MergeSort.sort(input)
    assertResult(input.sorted)(sorted)
  }

  test("sort if sorted asc") {
    val input = List(1, 5, 8, 8, 9)
    val sorted = MergeSort.sort(input)
    assertResult(input.sorted)(sorted)
  }

  test("sort if sorted desc") {
    val input = List(10, 8, 7, 5, 4, 3, 2, -1, -10)
    val sorted = MergeSort.sort(input)
    assertResult(input.sorted)(sorted)
  }

  test("sort if all element is the same") {
    val input = List(1, 1, 1, 1, 1)
    val sorted = MergeSort.sort(input)
    assertResult(input.sorted)(sorted)
  }

  test("sort if empty") {
    val input = List.empty[Int]
    val sorted = MergeSort.sort(input)
    assertResult(input.sorted)(sorted)
  }
}
