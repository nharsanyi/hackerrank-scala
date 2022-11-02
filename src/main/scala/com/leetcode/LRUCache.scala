package com.leetcode

import scala.collection.mutable

class LRUCache(_capacity: Int) {

  var storage = new mutable.LinkedHashMap[Int, Int]()

  def get(key: Int): Int = {
    val res = storage.getOrElse(key, -1)
    if (res != -1) {
      storage.remove(key)
      storage.put(key, res) // add back to the end
    }
    res
  }


  def put(key: Int, value: Int) {
    if (storage.contains(key)) {
      storage.remove(key) // move to the end
    } else if (_capacity == storage.size) {
      storage = storage.drop(1) // remove the first one
    }
    storage.put(key, value)
  }

}

object LRUCache {

}
