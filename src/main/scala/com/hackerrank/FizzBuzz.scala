package com.hackerrank

object FizzBuzz {
  def fizzBuzz(n: Int) {
    for (i <- 1 to n) {
      if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz")
      else if (i % 3 == 0) println("Fizz")
      else if (i % 5 == 0) println("Buzz")
      else println(i)
    }
  }

}
