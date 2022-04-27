package com.hackerrank

import scala.collection.mutable.ListBuffer

object SherlockAndCost {

  def cost(b: Array[Int]): Int = {
    val n = b.length
    val dp = Array.ofDim[Long](n ,2)
    for (i <- 0 to n - 2) {
      val curr: Long = b(i)
      dp(i + 1)(0) = math.max(dp(i)(0), dp(i)(1) + math.abs(1 - curr)) // select 1 -> dp(i,0) we choose 1 previously so the diff 0
      dp(i + 1)(1) = math.max(dp(i)(0) + math.abs(1 - b(i + 1)), dp(i)(1) + math.abs(b(i + 1) - b(i))) // select value
    }
    math.max(dp(n - 1)(0), dp(n - 1)(1)).toInt
  }

  type SelectedValue = Int
  type SumSoFar = Int

  // Complete the cost function below.
  def cost2(b: Array[Int]): Int = {
    val n = b.length - 1
    var prevResult: List[(SelectedValue, SumSoFar)] = init(b)
    var max = Int.MinValue
    for (i <- 1 to n) {
      val x = b(i)
      val res = generateSum(prevResult, x)
      max = math.max(res._2, max)
      prevResult = res._1

    }
    max
  }

  private def init(b: Array[SumSoFar]) = {
    var init = new ListBuffer[(SelectedValue, SumSoFar)]()
    val c = b(0)
    var first = (c, 0)
    init += first
    if (c != 1) {
      val o = (1, 0)
      init += o
    }
    init.toList
  }

  def generateSum(previousResult: List[(SelectedValue, SumSoFar)], current: Int): (List[(SelectedValue, SumSoFar)], Int) = {
    var list = new ListBuffer[(SelectedValue, SumSoFar)]()
    var max = Int.MinValue
    for (pair <- previousResult) {
      val prevValue = pair._1
      val min = math.min(1, current)

      val diffWithMin = math.abs(min - prevValue)
      val sum1 = pair._2 + diffWithMin
      val withMin = (min, sum1)
      list += withMin
      max = math.max(max, sum1)

      if (min != current) {
        val diffWithMax = math.abs(current - prevValue)
        val sum2 = pair._2 + diffWithMax
        val withMax = (current, sum2)
        list += withMax
        max = math.max(max, sum2)
      }
    }
    (list.toList, max)
  }

}
