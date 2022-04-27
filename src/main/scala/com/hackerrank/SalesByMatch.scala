package com.hackerrank

import scala.collection.mutable

object SalesByMatch {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    // Write your code here
    var result = 0
    val buffer: mutable.Map[Int, Int] = mutable.Map.empty
    for (a <- ar) {
      val oldValue: Int = buffer.getOrElse(a, 0)
      val newValue = oldValue + 1
      if (newValue % 2 == 0) result += 1
      buffer += (a -> newValue)
    }
    result
  }

}
