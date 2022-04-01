package com.interviewbit

object SpiralOrderMatrix {

  def spiralOrder(A: Array[Array[Int]]): Array[Int]  = {
    val m = A.length // rows
    val n = A(0).length // columns
    val resultLength = m * n
    val result: Array[Int] = Array.ofDim[Int](resultLength)
    var top = 0
    var bottom = m - 1
    var right = n - 1
    var left = 0
    var dir = 0
    var i = 0
    while (i < resultLength) {
      dir match {
        case 0 => // right
          for (j <- left to right) {
            result(i) = A(top)(j)
            i += 1
          }
          top += 1
          dir = 1
        case 1 => // down
          for (j <- top to bottom) {
            result(i) = A(j)(right)
            i += 1
          }
          right -= 1
          dir = 2
        case 2 => // left
          for (j <- right to left by -1) {
            result(i) = A(bottom)(j)
            i += 1
          }
          bottom -= 1
          dir = 3
        case 3 => // up
          for (j <- bottom to top by -1) {
            result(i) = A(j)(left)
            i += 1
          }
          left += 1
          dir = 0
        case _ => throw new IllegalArgumentException("Invalid direction")
      }
    }
    result
  }
}
