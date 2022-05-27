package com.leetcode

object ContainerWithMostWater {

  def maxArea(height: Array[Int]): Int = {
    var maxArea = 0
    val n = height.length
    for (containerEnd <- n - 1 to 1 by -1) {
      val endHeight = height(containerEnd)
      var containerStart = 0
      while (containerStart < containerEnd && (endHeight * (containerEnd - containerStart)) >= maxArea) {
        val startHeight = height(containerStart)
        val currentArea = math.min(endHeight, startHeight) * (containerEnd - containerStart)
        maxArea = math.max(currentArea, maxArea)
        containerStart += 1
      }
    }
    maxArea
  }
}
