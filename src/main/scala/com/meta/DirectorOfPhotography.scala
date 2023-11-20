package com.meta

import scala.collection.mutable

object DirectorOfPhotography {

  def getArtisticPhotographCount(N: Int, C: String, X: Int, Y: Int): Int = {
    // Write your code here

    def isArtistic(P: Int, A: Int, B: Int): Boolean = {
      val dPA = Math.abs(P - A)
      val dAB = Math.abs(A - B)
      dPA >= X && dPA <= Y && dAB >= X  && dAB <= Y
    }

    def findComposition(i: Int, lastChar: Char) = {
      var res = 0
      var j = C.indexOf('A', i + 1)
      while (j > i && j < N - 1) {
        var k = C.indexOf(lastChar, j + 1)
        while (k > j && k < N) {
          if (isArtistic(k, j, i)) res += 1
          k = C.indexOf(lastChar, k + 1)
        }
        j = C.indexOf('A', j + 1)
      }
      res
    }

    var res = 0
    var i = 0
    while (i < N - 2) {
      val curr = C.charAt(i)
      curr match {
        case 'B' => { // BAP
          res += findComposition(i, 'P')
          i += 1
        }
        case 'P' => { // PAB
          res += findComposition(i, 'B')
          i += 1
        }
        case _ => i += 1
      }
    }
    res
  }

}
