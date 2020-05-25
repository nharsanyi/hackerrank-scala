package com.hackerrank

object TimeConversion {

  /**
    * 12:00:00AM -> 00:00:00; 12:00:00PM -> 12:00:00; 1:00:00PM -> 13:00:00
    * @param s
    * @return
    */
  def timeConversion(s: String): String = {
    /*
     * Write your code here.
     */
    val isAm = s.endsWith("AM")
    val splits = s.substring(0, s.length - 2).split(":")
    val hh = splits(0).toInt
    val mm = splits(1)
    val ss = splits(2)

    val cH = if (!isAm && hh == 12) 0 else hh

    val newHour = if (isAm) cH % 12 else cH + 12

    val hhS = "%02d".format(newHour)

    s"$hhS:$mm:$ss"
  }

}
