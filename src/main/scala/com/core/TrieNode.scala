package com.core

import java.util

import scala.collection.mutable.ListBuffer

class TrieNode(value: Char, children: ListBuffer[TrieNode] = new ListBuffer[TrieNode]()) {
  var _value = value
  var _children = children

  def addChar(_c: Char): TrieNode = {
    val node = new TrieNode(_c)
    _children.addOne(node)
    node
  }

  def find(_c: Char): TrieNode = {
    for (child <- _children) {
      if (child._value == _c) {
        return child
      }
    }
    null.asInstanceOf[TrieNode]
  }
}

