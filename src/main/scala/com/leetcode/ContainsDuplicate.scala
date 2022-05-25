package com.leetcode

import scala.collection.mutable

object ContainsDuplicate {

  def containsDuplicate(nums: Array[Int]): Boolean = {
    val set: mutable.Set[Int] = mutable.HashSet.empty[Int]
    for (n <- nums) {
      if (!set.add(n)) {
        return true
      }
    }
    false
  }

}
