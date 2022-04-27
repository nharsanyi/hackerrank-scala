package com.interviewbit

import com.core.ArrayUtils

object BubbleSort {

  def bubbleSort(array: Array[Int], n: Int): Unit = {
    for (i <- 0 to n) {
      var swapped = false
      for (j <- 0 to n - i - 2) {
        if (array(j) > array(j + 1)) {
          ArrayUtils.swap(array, j, j + 1)
          swapped = true
        }
      }
      if (!swapped) {
        return
      }
    }
  }

  def sort(array: Array[Int]): Unit = {
    bubbleSort(array, array.length)
  }
}
