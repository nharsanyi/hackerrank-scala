package com.hackerrank

object MiniMaxSum {

  def miniMaxSum(arr: Array[Int]) {
    val totalSum: Long = arr.foldLeft(0l)(_ + _)
    println(totalSum)
    var max = Long.MinValue
    var min = Long.MaxValue

    for (a <- arr) {
      val sumWithoutA = totalSum - a
      println(sumWithoutA)
      min = math.min(sumWithoutA, min)
      max = math.max(sumWithoutA, max)
    }
    println(s"$min $max")
  }
}
