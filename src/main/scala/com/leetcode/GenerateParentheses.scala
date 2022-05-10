package com.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object GenerateParentheses {

  def generateParenthesis(n: Int): List[String] = {
    val result = new ListBuffer[String]()
    var stack = ""

    def generate(openingBrackets: Int, closingBrackets: Int): Unit = {
      if (openingBrackets == closingBrackets && openingBrackets == n) {
        println("Done")
        result.append(stack.mkString(""))
        return
      }
      if (openingBrackets < n) {
        println("Add opening")
        stack = stack.appended('(')
        generate(openingBrackets + 1, closingBrackets)
        stack = stack.dropRight(1) // remove last
      }
      if (closingBrackets < openingBrackets) {
        println("Add closing")
        stack = stack.appended(')')
        generate(openingBrackets, closingBrackets + 1)
        stack = stack.dropRight(1)
      }

    }
    generate(0, 0)
    result.toList

  }
}
