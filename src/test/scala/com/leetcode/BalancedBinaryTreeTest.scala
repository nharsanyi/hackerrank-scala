package com.leetcode

import com.core.TreeNode
import org.scalatest.FunSuite

class BalancedBinaryTreeTest extends FunSuite {

  test("should return result for input1") {
    val input = new TreeNode(3,
      new TreeNode(9),
      new TreeNode(20, new TreeNode(15), new TreeNode(7)))

    assertResult(true)(BalancedBinaryTree.isBalanced(input))
  }

  test("should return result for input2") {
    val input = new TreeNode(1,
      new TreeNode(2,
        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
        new TreeNode(3)
      ),
      new TreeNode(2))

    assertResult(false)(BalancedBinaryTree.isBalanced(input))
  }

}
