package com.interviewbit

object ReOrderLogs {

  def reorderLogs(A: Array[String]): Array[String]  = {

    case class Log(id: String, log: String)
    val n = A.length
    val digitLogs = Array.ofDim[Log](n)
    val letterLogs = Array.ofDim[Log](n)

    var i, j = 0
    for (a <- A) {
      val Array(id, log) = a.split("-", 2)
      if (log.replaceAll("-", "").forall(_.isDigit)) {
        digitLogs(i) = Log(id, log)
        i += 1
      } else {
        letterLogs(j) = Log(id, log)
        j += 1
      }
    }
    val sortedLetters = letterLogs.filter(_ != null).sortWith((log1, log2) => {
      val compare = if (log1.log == log2.log) {
        log1.id.compareTo(log2.id)
      } else {
        log1.log.compareTo(log2.log)
      }
//      println(s"${log1.id}-${log1.log} compareTo ${log2.id}-${log2.log} = $compare")
      compare < 0
    })
    val result = Array.ofDim[String](n)
    var k = 0
    for (a <- sortedLetters) {
      result(k) = s"${a.id}-${a.log}"
      k += 1
    }
    for (a <- digitLogs.filter(_ != null)) {
      result(k) = s"${a.id}-${a.log}"
      k += 1
    }
    result
  }
}
