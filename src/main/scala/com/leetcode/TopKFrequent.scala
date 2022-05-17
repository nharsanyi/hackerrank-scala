package com.leetcode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object TopKFrequent {

  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    // nr, freq
    val maxHeap = mutable.PriorityQueue.empty[(Int, Int)](Ordering.by((_: (Int, Int))._2))
    val hashMap = nums.foldLeft(mutable.HashMap.empty[Int, Int]){ case (map, n) => map += n -> (map.getOrElse(n, 0) + 1)}
    for ((n, freq) <- hashMap) {
      maxHeap.addOne((n, freq))
    }
    val res = new ArrayBuffer[Int]()
    for (_ <- 1 to k) {
      res.addOne(maxHeap.dequeue()._1)
    }
    res.toArray
  }
}
