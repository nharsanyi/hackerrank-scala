package com.leetcode

import scala.collection.mutable

object ValidSudoku {

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    var hashMap = new mutable.HashMap[(Int, Int), Char]()
    // validate rows
    for (i <- 0 to 8) {
      val rowSet = new mutable.HashSet[Char]()
      for (j <- 0 to 8) {
        val curr = board(i)(j)
        if (curr.isDigit) {
          if (rowSet.contains(curr)) {
            return false
          }
          rowSet.add(curr)
          hashMap += (i, j) -> curr
        }
      }
    }

    // validate cols
    for (i <- 0 to 8) {
      val colSet = new mutable.HashSet[Char]()
      hashMap.filter { case (key, _) => key._2 == i }
        .values
        .foreach(c => if (!colSet.add(c)) return false)
    }

    def validateBlock(fromRow: Int, toRow: Int, fromCol: Int, toCol: Int): Boolean = {
      val blockSet = new mutable.HashSet[Char]()
      for (row <- fromRow to toRow) {
        for (col <- fromCol to toCol) {
          val curr: Char = hashMap.getOrElse((row, col), -1.toChar)
          if (curr != -1.toChar) {
            if (!blockSet.add(curr)) {
              return false
            }
          }
        }
      }
      true
    }

    validateBlock(0, 2, 0, 2) &&
      validateBlock(0, 2, 3, 5) &&
      validateBlock(0, 2, 6, 8) &&
      validateBlock(3, 5, 0, 2) &&
      validateBlock(3, 5, 3, 5) &&
      validateBlock(3, 5, 6, 8) &&
      validateBlock(6, 8, 0, 2) &&
      validateBlock(6, 8, 3, 5) &&
      validateBlock(6, 8, 6, 8)

  }
}
