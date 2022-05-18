package com.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object GroupAnagrams {

  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    var buffer = new mutable.HashMap[String, ListBuffer[Int]]()
    val n = strs.length
    for (i <- 0 to n - 1) {
      val hashKey = strs(i).toCharArray.sorted.mkString
      val ids = buffer.getOrElse(hashKey, ListBuffer.empty[Int]).addOne(i)
      buffer += (hashKey -> ids)
    }
    val value = buffer.map { case (_, ids) => ids.map(id => strs(id)).toList }
    value.toList
  }
}
