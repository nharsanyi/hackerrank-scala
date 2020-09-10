package com.hackerrank

object NewYearChaos {

  // Complete the minimumBribes function below.
  def minimumBribes(q: Array[Int]): Int = {
    val n = q.size
    var result = 0
    for (i <- n - 1 to 0 by -1) {
      if (q(i) != i + 1) {
        // bribe happened
        if (i >= 1 && q(i - 1) == i + 1) { // 1 bribe
          result += 1
          swap(q, i, i - 1)
        } else if (i >= 2 && q(i - 2) == i + 1) { // 2 bribes
          result += 2
          swap(q, i - 2, i - 1)
          swap(q, i - 1, i)
        } else { // more than 2 bribes
          println("Too chaotic")
          return -1
        }
      }
    }
    println(result)
    result
  }

  def swap(arr: Array[Int], index1: Int, index2: Int): Unit = {
    val tmp = arr(index1)
    arr.update(index1, arr(index2))
    arr.update(index2, tmp)
  }
}
