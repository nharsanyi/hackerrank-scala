package com.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val hashMap = mutable.HashMap.empty[Int, ListBuffer[Int]]
    val n = nums.length
    for (i <- 0 to n - 1) {
      val num = nums(i)
      val oldIndex = hashMap.getOrElse(num, ListBuffer.empty).addOne(i)
      hashMap += num -> oldIndex
    }
    var i = 0
    for (k <- nums) {
      val diff = target - k
      if (diff == k && (hashMap.contains(diff) && hashMap.get(diff).get.length > 1)) {
        val indeces = hashMap.get(diff).get.sorted
        return Array(indeces(0), indeces(1))
      } else if (diff != k && hashMap.contains(diff)) {
        val diffIndex = hashMap.get(diff).get.head
        return Array(i, diffIndex)
      }
      i += 1
    }
    Array() // it should never happen, since we have result garantued
  }


  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    var hashmap = new mutable.HashMap[Int, Array[Int]]()
    val n = nums.length
    for (i <- 0 to n - 1) {
      val num = nums(i)
      val oldValue = hashmap.getOrElse(num, Array())
      hashmap += (num -> (i +: oldValue))
    }
    // 2 -> [0], 7 -> [1], 11 -> [2], 15 -> [3]
    for (i <- 0 to n  - 1) {
      val num = nums(i)
      val missing = target - num
      if (num == missing && hashmap.get(num).get.length >= 2) {
        return hashmap.get(num).get
      } else if (num != missing && hashmap.contains(missing)) {
        return Array(i, hashmap.get(missing).get(0))
      }
    }
    Array[Int]()
  }

}
