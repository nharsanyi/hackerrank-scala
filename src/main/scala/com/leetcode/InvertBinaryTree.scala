package com.leetcode

import com.core.TreeNode

object InvertBinaryTree {

  def invertTree(root: TreeNode): TreeNode = {
    if (root == null || (root.left == null && root.right == null)) {
      return root
    }
    val tmpNode = invertTree(root.right)
    root.right = invertTree(root.left)
    root.left = tmpNode
    root
  }

}
