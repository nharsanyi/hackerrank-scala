package com.hackerrank

import scala.collection.mutable.ListBuffer

object LuckBalance {

  def luckBalance(k: Int, contests: Array[Array[Int]]): Int = {
    var balance = 0
    var importantContests = ListBuffer[Int]()
    for (contest <- contests) {
      val l = contest(0)
      val t = contest(1)
      if (t == 0) {
        balance += l
      } else {
        importantContests += l
      }
    }
    val scoresSorted = importantContests.sorted
    val importantSize = importantContests.size
    val n = importantSize - k
    for (i <- 0 to n - 1) {
      balance -= scoresSorted(i)
    }
    for (i <- n to importantSize - 1) {
      balance += scoresSorted(i)
    }
    balance
  }
}
