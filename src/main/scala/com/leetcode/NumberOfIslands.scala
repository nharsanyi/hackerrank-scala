package com.leetcode

object NumberOfIslands {

  def numIslands(grid: Array[Array[Char]]): Int = {
    val n = grid.length
    val m = grid(0).length

    var count = 0

    val visited = Array.fill[Array[Boolean]](n)(Array.fill[Boolean](m)(false))

    def traverse(row: Int, col: Int): Int = {
      if (row < 0 || row >= n || col < 0 || col >= m) {
        return -1 // hit the wall
      }
      val root = grid(row)(col)
      if (root == '0') {
        return -1 // it's water
      }

      visited(row)(col) = true
      if (col - 1 >= 0 && !visited(row)(col - 1)) {
        traverse(row, col - 1) // visit left
      }
      if (col + 1 < m && !visited(row)(col + 1)) {
        traverse(row, col + 1) // visit right
      }
      if (row - 1 >= 0 && !visited(row - 1)(col)) {
        traverse(row - 1, col) // visit top
      }
      if (row + 1 < n && !visited(row + 1)(col)) {
        traverse(row + 1, col) // visit down
      }
      1
    }

    for (i <- 0 to n - 1) {
      for (j <- 0 to m - 1) {
        val root = grid(i)(j)
        if (root == '1' && !visited(i)(j)) {
          traverse(i, j)
          count += 1
        }
      }
    }
    count
  }
}
