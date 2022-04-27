package com.hackerrank

object CtciBubbleSort {

  def countSwaps(a: Array[Int]) = {
    // Write your code here
    var i: Int = 0
    val n = a.length
    var numSwaps = 0
    while (i < n) {
      var j: Int = 0
      while (j < n - 1) { // Swap adjacent elements if they are in decreasing order
        if (a(j) > a(j + 1)) {
          swap(a, j, j + 1)
          numSwaps += 1
        }
        j += 1
      }
      i += 1
    }
    (numSwaps, a.head, a.last)
  }

  def solve(a: Array[Int]): Unit = {
    val result = countSwaps(a)
    printResult(result._1, result._2, result._3)
  }

  def printResult(numSwaps: Int, head: Int, last: Int): Unit = {
    println(s"Array is sorted in $numSwaps swaps.")
    println(s"First Element: $head")
    println(s"Last Element: $last")
  }

  def swap(a: Array[Int], i: Int, j: Int): Unit = {
    val tmp = a(i)
    a(i) = a(j)
    a(j) = tmp
  }

}
