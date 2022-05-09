package com.leetcode

import com.core.TreeNode
import org.scalatest.FunSuite

class InvertBinaryTreeTest extends FunSuite {

  test("should invert tree input 1") {
    val input = new TreeNode(4,
      new TreeNode(2, new TreeNode(1), new TreeNode(3)),
      new TreeNode(7, new TreeNode(6), new TreeNode(9))

    )
    val expected = new TreeNode(4,
      new TreeNode(7, new TreeNode(9), new TreeNode(6)),
      new TreeNode(2, new TreeNode(3), new TreeNode(1))
    )
    val actual = InvertBinaryTree.invertTree(input)
    assertResult(expected)(actual)
  }
}
