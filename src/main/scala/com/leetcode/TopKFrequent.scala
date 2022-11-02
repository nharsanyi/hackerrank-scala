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

  def topKFrequent2(nums: Array[Int], k: Int): Array[Int] = {
    val n = nums.length
    var freqs = new mutable.HashMap[Int, Int]()
    for (num <- nums) {
      val oldFreq = freqs.getOrElse(num, 0)
      freqs += (num -> (oldFreq + 1))
    }
    // 1 -> 3, 2 -> 2, 3 -> 1
    freqs.toSeq.sortWith(_._2 < _._2).map(_._1).toArray.take(k)
  }
}
