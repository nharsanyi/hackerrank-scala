package com.hackerrank

object UserFriendlyPwdSystem {

  def authEvents(events: Array[Array[String]]): Array[Int] = {
    val m = events.foldLeft(0)((prev, events) => if (events(0) == "authorize") prev + 1 else prev)
    val resp = Array.fill(m)(0)
    var currPwdHash = 0l
    var currPwd = ""
    var i: Int = 0
    events.foreach(event => {
      val eventType = event(0)
      val param = event(1)
      val isSetPwdEvent = eventType == "setPassword"
      if (isSetPwdEvent) {
        currPwd = param.asInstanceOf[String]
        currPwdHash = hash(currPwd)
      } else {
        // auth
        val pwdHash = param.toLong
        if (isValidPwd(pwdHash, currPwdHash, currPwd)) {
          resp(i) = 1
        }
        i += 1
      }

    })

    resp
  }

  def isValidPwd(pwdHash: Long, currPwdHash: Long, currPwd: String): Boolean = {
    if (pwdHash == currPwdHash) {
      true
    } else {
      for (i <- 'a' to 'z') {
        val appended = currPwd + "" + i
        val h = hash(appended)
        if (h == pwdHash) return true
      }
      for (i <- 'A' to 'Z') {
        val appended = currPwd + "" + i
        val h = hash(appended)
        if (h == pwdHash) return true
      }
      for (i <- 0 to 9) {
        val appended = currPwd + "" + i
        val h = hash(appended)
        if (h == pwdHash) return true
      }
      false
    }
  }

  def hash(s: String) = {
    val p = 131
    val M = math.pow(10, 9) + 7

    val n = s.length - 1
    var sum = 0l
    for (i <- 0 to n) {
      sum += ((f(s.charAt(i)) * math.pow(p, n - i)) % M).toLong
    }
    (sum % M).toLong
  }

  def f(x: Char) = x.toInt

}
