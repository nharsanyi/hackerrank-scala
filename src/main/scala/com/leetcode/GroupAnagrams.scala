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

  def groupAnagrams2(strs: Array[String]): List[List[String]] = {
    val map = new mutable.HashMap[String, ListBuffer[String]]()
    for (str <- strs) {
      val hashKey = str.toCharArray.sorted.mkString("")
      var group = map.getOrElse(hashKey, ListBuffer.empty[String])
      group.addOne(str)
      map.put(hashKey, group)
    }
    map.values.map(_.toList).toList
  }
}
