package com.leetcode

import scala.collection.immutable.{ListMap, SortedMap, TreeMap}

object IntToRoman {

  val mapping = ListMap(
    1000 -> 'M',
    500 -> 'D',
    100 -> 'C',
    50 -> 'L',
    10 -> 'X',
    5 -> 'V',
    1 -> 'I'
  )

  val units = List(1000, 100, 10, 1)

  def intToRoman(num: Int): String = {
    val buffer = Array.ofDim[Int](units.length)

    def numberToUnits(currN: Int, unitIndex: Int): Unit = {
      if (unitIndex >= units.length || currN <= 0) return
      val currUnit = units(unitIndex)
      val currAmount = currN / currUnit
      val rem = currN % currUnit
      buffer(unitIndex) = currAmount
      numberToUnits(rem, unitIndex + 1)
    }

    def unitsToLetters = {
      val strBuffer = new StringBuilder("")
      for (unitIndex <- 0 to units.length - 1) {
        val amount = buffer(unitIndex)
        val unit = units(unitIndex)
        if (amount == 4) {
          val prevUnit = 5 * unit
          strBuffer.append(mapping(unit))
          strBuffer.append(mapping(prevUnit))
        } else if (amount == 9) {
          val prevUnit = units(unitIndex - 1)
          strBuffer.append(mapping(unit))
          strBuffer.append(mapping(prevUnit))
        } else if (amount >= 5) {
          strBuffer.append(mapping(5 * unit))
          for (_ <- 0 to (amount - 5) - 1) {
            strBuffer.append(mapping(unit))
          }
        } else {
          for (_ <- 0 to amount - 1) {
            strBuffer.append(mapping(unit))
          }
        }
      }
      strBuffer.toString()
    }

    numberToUnits(num, 0)
    unitsToLetters
  }
}
