package com.hackerrank

import scala.collection.mutable

object SockMerchant {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    val undpairedSocks = mutable.HashSet[Int]()
    ar.foreach((a: Int) => {
      if (undpairedSocks.contains(a)) {
        undpairedSocks.remove(a)
      } else {
        undpairedSocks.add(a)
      }
    })
    (n - undpairedSocks.size) / 2
  }

}
