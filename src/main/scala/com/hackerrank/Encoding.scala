package com.hackerrank

object Encoding {

  def encryption(s: String): String = {
    // Write your code here
    val clean = s.replaceAll("\\s", "")
    val l = clean.size
    val sqrt = math.sqrt(l)
    println(f"l=$l sqrt=$sqrt")
    var rows = math.floor(sqrt).toInt
    println(f"rows=$rows")

    val cols = math.ceil(sqrt).toInt
    println(f"cols=$cols")
    if (rows * cols < l) {
      rows += 1
    }

    val res = Array.fill(cols)(Array.ofDim[String](rows))
    for (i <- 0 to l - 1) {
      val r = i % cols
      val c = i / cols
      res(r)(c) = clean.charAt(i).toString

    }
    val smallRes = res.map(arr => arr.filter(x => x != null && !x.isBlank).mkString(""))
    val output = smallRes.mkString(" ")
    output
  }

}
