package com.hackerrank

object GradingStudents {

  private val LIMIT = 38

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    grades.map(grade => {
      if (grade < LIMIT) grade
      else {
        val div = grade / 5
        val mod = grade % 5
        if (mod >= 3) (div + 1) * 5
        else grade
      }
    })
  }

}
