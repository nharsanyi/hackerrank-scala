package com.hackerrank

object ConstructTheArray {

  private val MODULO = (math.pow(10, 9) + 7).toLong

  def countArray(n: Int, k: Int, x: Int): Long = {
    // Return the number of ways to fill in the array.
    val endsWithX = Array.ofDim[Long](n)
    val notEndsWithX = Array.ofDim[Long](n)

    endsWithX(0) = if (x == 1) 1l else 0l
    notEndsWithX(0) = if (x == 1) 0l else 1l
    for (i <- 1 to n - 1) {
      endsWithX(i) = notEndsWithX(i - 1) % MODULO
      notEndsWithX(i) = (endsWithX(i - 1) * (k - 1) + notEndsWithX(i - 1) * (k - 2)) % MODULO
    }
    endsWithX(n - 1) % MODULO
  }

}
