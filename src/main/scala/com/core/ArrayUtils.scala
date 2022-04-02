package com.core

object ArrayUtils {

  def swap(array: Array[Int], i: Int, j: Int): Unit = {
    val tmp = array(i)
    array(i) = array(j)
    array(j) = tmp
    println("Swapped")
  }
}
