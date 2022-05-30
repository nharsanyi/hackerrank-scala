package com.leetcode

import scala.collection.mutable
import scala.util.Try

object EvalReversePolishNation {

  val stack = mutable.Stack.empty[String]

  def evalRPN(tokens: Array[String]): Int = {
    for (token <- tokens) {
      if (Try(token.toInt).isSuccess) {
        stack.push(token)
      } else {
        val  a = stack.pop().toInt
        val  b = stack.pop().toInt
        val res = token match {
          case "*" => a * b
          case "/" => b / a
          case "+" => a + b
          case "-" => b - a
        }
        stack.push(res.toString)
      }
    }
    stack.pop().toInt
  }
}
