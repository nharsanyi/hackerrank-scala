package com.leetcode

import com.core.TreeNode
import org.scalatest.FunSuite

class MaxDepthBinaryTreeTest extends FunSuite {

    test("should return max depth input 1") {
      val input = new TreeNode(3,
        new TreeNode(9, null),
        new TreeNode(20, new TreeNode(15), new TreeNode(7))
      )
      assertResult(3)(MaxDepthBinaryTree.maxDepth(input))
    }

  test("should return max depth input 2") {
    val input = new TreeNode(1,
      null,
      new TreeNode(2, null)
    )
    assertResult(2)(MaxDepthBinaryTree.maxDepth(input))
  }
}
