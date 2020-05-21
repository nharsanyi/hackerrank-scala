package com.hackerrank


import scala.collection.mutable

object SherlockAnagrams {

  def sherlockAndAnagrams(s: String): Int = {
    val n = s.length
    val subStrings = new mutable.HashMap[String, Int]()

    for (i <- 0 to n - 1) {
      for (j <- i + 1 to n) {
        val cs = s.substring(i, j)
        val hash = generateHash(cs)
        val oldV = subStrings.getOrElse(hash, 0)
        subStrings.put(hash, oldV + 1)
      }
    }
    val count = subStrings.foldRight(0)((tuple, counter) => {
      // (n choose k) => n!/(k!(n-k)!)
      val n = tuple._2
      counter + choose(n, 2).toInt
    })
    count
  }

  def choose(n: Int, k: Int) = fact(n) / (fact(n - k) * fact(k))

  def fact(n: Int): BigInt = {
    def factorialAcc(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(BigInt(1), n)
  }

  def generateHash(s: String): String = s.toCharArray.sorted.mkString

}
