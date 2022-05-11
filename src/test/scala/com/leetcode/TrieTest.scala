package com.leetcode

import org.scalatest.FunSuite

class TrieTest extends FunSuite {

  test("should find word input 1") {
    val trie = new Trie()
    trie.insert("apple")
    assertResult(true)(trie.search("apple"))
    assertResult(false)(trie.search("app"))
    assertResult(true)(trie.startsWith("app"))
    trie.insert("app")
    assertResult(true)(trie.search("app"))
  }

}
