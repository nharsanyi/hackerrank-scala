package com.leetcode

import scala.collection.mutable

object ValidParentheses {

  val OPENING_BRACKETS = Array('(', '[', '{')
  val CLOSING_BRACKETS = Array(')', ']', '}')

  def isValid(s: String): Boolean = {
    val n = s.length
    val stack = mutable.Stack[Char]()

    for (i <- 0 to n - 1) {
      val currChar = s.charAt(i)
      if (OPENING_BRACKETS contains currChar) {
        stack.push(currChar)
      } else {
        val index = CLOSING_BRACKETS.indexOf(currChar)
        if (stack.isEmpty) return false
        val pop = stack.pop()
        if (pop != OPENING_BRACKETS(index)) {
          return false
        }
      }
    }
    stack.isEmpty
  }

}
