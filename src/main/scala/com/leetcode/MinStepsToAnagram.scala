package com.leetcode

import scala.collection.mutable

object MinStepsToAnagram {

  def minSteps(s: String, t: String): Int = {
    val mapS = s.foldLeft(mutable.Map.empty[Char, Int])((map, currChar) => map += currChar -> (map.getOrElse(currChar, 0) + 1))
    val mapT = t.foldLeft(mapS)((map, currChar) => map += currChar -> (map.getOrElse(currChar, 0) - 1))
    mapT.filter(_._2 != 0).foldLeft(0)((x, kv) => x + math.abs(kv._2)) / 2
  }

}
