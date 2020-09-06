package com.hackerrank

import scala.collection.mutable

object RansomNote {

  def checkMagazine(magazine: Array[String], note: Array[String]): Boolean = {
    val m = magazine.size
    val n = note.size

    if (m < n) {
      false
    } else {
      // init dictionary
      val dict = new mutable.HashMap[String, Int]()
      magazine.foreach(word => dict.put(word, dict.getOrElse(word, 0) + 1))
      if (canCreateNote(dict, note)) true
      else false
    }
  }

  def canCreateNote(dict: mutable.HashMap[String, Int], note: Array[String]): Boolean = {
    note.foreach(word => {
      val count = dict.getOrElse(word, 0)
      if (count == 0) return false
      else dict.update(word, count - 1)
    })
    true
  }
}
