package com.leetcode

import scala.collection.mutable.ArrayBuffer

object KClosestPointToOrigin {

  def kClosest(points: Array[Array[Int]], k: Int): Array[Array[Int]] = {
    val range: Array[Int] = points.zipWithIndex
      .map{ case(point, index) => (index, get_distance(point))}
      .sortWith(_._2 < _._2).take(k).map(_._1)
    range.foldLeft(new ArrayBuffer[Array[Int]]())((buffer, index) => buffer.addOne(points(index))).toArray
  }

  def get_distance(point: Array[Int]): Double = {
    val x = point(0)
    val y = point(1)
    math.sqrt(math.pow(x, 2) + math.pow(y, 2))
  }
}
