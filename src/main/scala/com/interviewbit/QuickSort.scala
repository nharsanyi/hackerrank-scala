package com.interviewbit

object QuickSort {

  def sort(array: Array[Int]): Unit = {
    quickSort(array, 0, array.length - 1)
  }

  def quickSort(array: Array[Int], low: Int, high: Int): Unit = {
    if (low < high) {
      val pivotIndex = pivot(array, low, high)
      quickSort(array, low, pivotIndex - 1)
      quickSort(array, pivotIndex + 1, high)
    }
  }

  def swap(array: Array[Int], i: Int, j: Int): Unit = {
    val tmp = array(i)
    array(i) = array(j)
    array(j) = tmp
    println("Swapped")
  }

  def pivot(array: Array[Int], low: Int, high: Int): Int = {
    val pivot: Int = array(high)
    var i = low - 1
    for (j <- low to high) {
      if (array(j) < pivot) {
        i += 1
        swap(array, i, j)
      }
    }
    i += 1
    swap(array, i, high)
    i
  }
}
