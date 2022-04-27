package com.interviewbit

import scala.annotation.tailrec

object MergeSort {

  def sort(array: List[Int]): List[Int] = {
    mergeSort(array)
  }

  def mergeSort(seq: List[Int]): List[Int] = seq match {
    case Nil => Nil
    case xs::Nil => List(xs)
    case _ =>
      val (left, right) = seq splitAt seq.length/2
      merge(mergeSort(left), mergeSort(right))
  }

  @tailrec
  def merge(seq1: List[Int], seq2: List[Int], accumulator: List[Int] = List()):List[Int] = (seq1, seq2) match {
    case (Nil, _) =>
      accumulator ++ seq2
    case (_, Nil) =>
      accumulator ++ seq1
    case (x::xs, y::ys) =>
      if(x<y) {
        merge(xs, seq2, accumulator :+ x)
      } else {
        merge(seq1,ys, accumulator :+ y)
      }
  }

}
