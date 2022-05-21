package com.leetcode

import org.scalatest.FunSuite

class ValidSudokuTest extends FunSuite {

  test("should return result for input 1") {
    val input = Array(
      Array('5', '3', '.', '.', '7', '.', '.', '.', '.'),
      Array('6', '.', '.', '1', '9', '5', '.', '.', '.'),
      Array('.', '9', '8', '.', '.', '.', '.', '6', '.'),
      Array('8', '.', '.', '.', '6', '.', '.', '.', '3'),
      Array('4', '.', '.', '8', '.', '3', '.', '.', '1'),
      Array('7', '.', '.', '.', '2', '.', '.', '.', '6'),
      Array('.', '6', '.', '.', '.', '.', '2', '8', '.'),
      Array('.', '.', '.', '4', '1', '9', '.', '.', '5'),
      Array('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    assertResult(true)(ValidSudoku.isValidSudoku(input))
  }

  test("should return result for input 2") {
    val input = Array(
      Array('8', '3', '.', '.', '7', '.', '.', '.', '.'),
      Array('6', '.', '.', '1', '9', '5', '.', '.', '.'),
      Array('.', '9', '8', '.', '.', '.', '.', '6', '.'),
      Array('8', '.', '.', '.', '6', '.', '.', '.', '3'),
      Array('4', '.', '.', '8', '.', '3', '.', '.', '1'),
      Array('7', '.', '.', '.', '2', '.', '.', '.', '6'),
      Array('.', '6', '.', '.', '.', '.', '2', '8', '.'),
      Array('.', '.', '.', '4', '1', '9', '.', '.', '5'),
      Array('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    assertResult(false)(ValidSudoku.isValidSudoku(input))
  }

//    [[".",".",".",".","5",".",".","1","."],
  //   [".","4",".","3",".",".",".",".","."],
  //   [".",".",".",".",".","3",".",".","1"],
  //   ["8",".",".",".",".",".",".","2","."],
  //   [".",".","2",".","7",".",".",".","."],
  //   [".","1","5",".",".",".",".",".","."],
  //   [".",".",".",".",".","2",".",".","."],
  //   [".","2",".","9",".",".",".",".","."],
  //   [".",".","4",".",".",".",".",".","."]]

  test("should return result for input 3") {
    val input = Array(
      Array('.', '.', '.', '.', '5', '.', '.', '1', '.'),
      Array('.', '4', '.', '3', '.', '.', '.', '.', '.'),
      Array('.', '.', '.', '.', '.', '3', '.', '.', '1'),
      Array('8', '.', '.', '.', '.', '.', '.', '2', '.'),
      Array('.', '.', '2', '.', '7', '.', '.', '.', '.'),
      Array('.', '1', '5', '.', '.', '.', '.', '.', '.'),
      Array('.', '.', '.', '.', '.', '2', '.', '.', '.'),
      Array('.', '2', '.', '9', '.', '.', '.', '.', '.'),
      Array('.', '.', '4', '.', '.', '.', '.', '.', '.')
    )

    assertResult(false)(ValidSudoku.isValidSudoku(input))
  }
}
