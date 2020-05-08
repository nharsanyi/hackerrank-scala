package com.hackerrank

object PlusMinus {

  def plusMinus(arr: Array[Int]): (String, String, String) = {
    var plus = 0
    var minus = 0
    var zero = 0

    val n = arr.length.toDouble

    arr.foreach(x => {
      if (x > 0) {
        plus += 1
      } else if (x < 0) {
        minus += 1
      } else {
        zero += 1
      }
    })
    val posFrac = "%.6f".format(plus / n)
    println(posFrac)
    val negFrac = "%.6f".format(minus / n)
    println(negFrac)
    val zeroFrac = "%.6f".format(zero / n)
    println(zeroFrac)
    (posFrac, negFrac, zeroFrac)
  }

}
