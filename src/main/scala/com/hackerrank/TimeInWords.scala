package com.hackerrank

object TimeInWords {

  def timeInWords(h: Int, m: Int): String = {
    m match {
      case x if x == 0 => s"${numberToWord(h)} o' clock"
      case x if x == 15 => s"quarter past ${numberToWord(h)}"
      case x if x == 45 => s"quarter to ${numberToWord(h + 1)}"
      case x if x == 30 => s"half past ${numberToWord(h)}"
      case x if x == 1 => s"one minute past ${numberToWord(h)}"
      case x if x < 30 => s"${{numberToWord(x)}} minutes past ${numberToWord(h)}"
      case x if x == 59 => s"one minute to ${numberToWord(h)}"
      case x => s"${numberToWord(60 - x)} minutes to ${numberToWord(h + 1)}"
    }
  }

  private def numberToWord(n: Int): String = {
    n match {
      case x if x == 1 => "one"
      case x if x == 2 => "two"
      case x if x == 3 => "three"
      case x if x == 4 => "four"
      case x if x == 5 => "five"
      case x if x == 6 => "six"
      case x if x == 7 => "seven"
      case x if x == 8 => "eight"
      case x if x == 9 => "nine"
      case x if x == 10 => "ten"
      case x if x == 11 => "eleven"
      case x if x == 12 => "twelve"
      case x if x == 13 => "thirteen"
      case x if x == 14 => "fourteen"
      case x if x == 15 => "fifteen"
      case x if x == 16 => "sixteen"
      case x if x == 17 => "seventeen"
      case x if x == 18 => "eighteen"
      case x if x == 19 => "nineteen"
      case x if x == 20 => "twenty"
      case x if x == 30 => "thirty"
      case x if x == 40 => "forty"
      case x if x == 50 => "fifty"
      case x => {
        val m = x % 10
        numberToWord(x - m) + " " + numberToWord(m)

      }
    }

  }

}
