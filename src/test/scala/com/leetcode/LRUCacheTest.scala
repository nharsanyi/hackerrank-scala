package com.leetcode

import com.core.TreeNode
import org.scalatest.FunSuite

class LRUCacheTest extends FunSuite {

  test("should return result for input1") {
    val lRUCache = new LRUCache(2)
    lRUCache.put(1, 1) // cache is {1=1}
    lRUCache.put(2, 2) // cache is {1=1, 2=2}
    assertResult(1)(lRUCache.get(1)) // return 1
    lRUCache.put(3, 3) // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    assertResult(-1)(lRUCache.get(2)) // returns -1 (not found)
    lRUCache.put(4, 4) // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    assertResult(-1)(lRUCache.get(1)) // return -1 (not found)
    assertResult(3)(lRUCache.get(3)) // return 3
    assertResult(4)(lRUCache.get(4)) // return 4

  }


}
