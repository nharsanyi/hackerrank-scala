package com.leetcode

import com.core.{TreeNode, TrieNode}

class Trie() {

  val head = new TrieNode(' ')

  def insert(word: String) {
    var curr = head
    for (c <- word.toCharArray) {
      val f = curr.find(c)
      if (f == null) {
        curr = curr.addChar(c)
      } else {
        curr = f
      }
    }
    curr.addChar('*') // end of word
  }

  def search(word: String): Boolean = {
    val prefix = findPrefix(word)
    prefix != null && prefix.find('*') != null
  }

  def findPrefix(prefix: String): TrieNode = {
    var curr = head
    for (c <- prefix.toCharArray) {
      if (curr == null) {
        return null.asInstanceOf[TrieNode]
      }
      curr = curr.find(c)
    }
    curr
  }

  def startsWith(prefix: String): Boolean = {
    findPrefix(prefix) != null
  }

}
