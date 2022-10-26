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



}
