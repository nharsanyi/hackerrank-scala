package com.leetcode

import com.core.TreeNode

object BalancedBinaryTree {

  def isBalanced(root: TreeNode): Boolean = {

    def getHeight(node: TreeNode): Int = {
      if (node == null) {
        return 0
      }
      val leftHeight = getHeight(node.left)
      val rightHeight = getHeight(node.right)
      if (leftHeight == -1 || rightHeight == -1) {
        return -1
      }
      if (math.abs(leftHeight - rightHeight) > 1) {
        return -1
      }
      math.max(leftHeight, rightHeight) + 1
    }

    getHeight(root) != -1
  }
}
