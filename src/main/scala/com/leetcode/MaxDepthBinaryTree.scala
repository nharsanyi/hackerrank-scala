package com.leetcode

import com.core.TreeNode

object MaxDepthBinaryTree {

  def maxDepth(root: TreeNode): Int = {
    if (root == null) {
      return 0
    }
    math.max(maxDepth(root.left), maxDepth(root.right)) + 1
  }
}
