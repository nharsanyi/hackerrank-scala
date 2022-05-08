package com.interviewbit

import scala.collection.mutable

object OccurenceOfEachNumber {

  /**
    * This solution can be sensitive to the number distribution within the input
    * If if covers a wide range, we have to create a massive buffer, which would cause memory error
    *
    * if we remove the min max and just use the max(a(i)) by definition which is
    * 10^9 => O(n), however it causes memory error
    * @param A
    * @return
    */
  def findOccurencesHeapError(A: Array[Int]): Array[Int]  = {
    val maxNumber = A.max
    val minNumber = A.min
    val buffer = Array.fill[Int](maxNumber - minNumber + 1)(0)
    for (a <- A) {
      val oldOcc = buffer(a - minNumber)
      buffer(a - minNumber) = oldOcc + 1
    }
    buffer.filter(_ > 0)
  }

  def findOccurences(A: Array[Int]): Array[Int]  = {
    val buffer = scala.collection.mutable.Map[Int,Int]()
    for (a <- A) {
      val oldValue: Int = buffer.getOrElse(a, 0)
      buffer += (a -> (oldValue + 1))
    }
    val sorted = buffer.keys.toList.sorted
    val result = Array.fill[Int](sorted.size)(0)
    var i = 0
    for (a <- sorted) {
      result(i) = buffer(a)
      i +=1
    }
    result
  }

}
