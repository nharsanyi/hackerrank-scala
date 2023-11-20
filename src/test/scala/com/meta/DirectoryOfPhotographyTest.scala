package com.meta

import org.scalatest.FunSuite

class DirectoryOfPhotographyTest extends FunSuite {

  test("test case 1") {
    assertResult(1)(DirectorOfPhotography.getArtisticPhotographCount(5, "APABA", 1, 2))
  }

  test("test case 2") {
    assertResult(0)(DirectorOfPhotography.getArtisticPhotographCount(5, "APABA", 2, 3))
  }

  test("test case 3") {
    assertResult(3)(DirectorOfPhotography.getArtisticPhotographCount(8, ".PBAAP.B", 1, 3))
  }
}
