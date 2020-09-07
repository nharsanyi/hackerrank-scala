package com.hackerrank

import org.scalatest.FunSuite

class UserFriendlyPwdSystemTest extends FunSuite {

  test("testAuthEvents") {
    val events = Array(
      Array("setPassword", "cAr1"),
      Array("authorize", "223691457"),
      Array("authorize", "303580761"),
      Array("authorize", "100"),
      Array("setPassword", "d"),
      Array("authorize", "100")
    )
    assertResult(Array[Int](1, 1, 0, 1))(UserFriendlyPwdSystem.authEvents(events))
  }

  test("testAuthEvents 2") {
    val events = Array(
      Array("setPassword", "000A"),
      Array("authorize", "108738450"),
      Array("authorize", "108738449"),
      Array("authorize", "244736787")
    )
    assertResult(Array[Int](0, 1, 1))(UserFriendlyPwdSystem.authEvents(events))
  }


  test("testAuthEvents 3") {
    val events = Array(
      Array("setPassword", "1"),
      Array("setPassword", "2"),
      Array("setPassword", "3"),
      Array("authorize", "49"),
      Array("authorize", "50")
    )
    assertResult(Array[Int](0, 0))(UserFriendlyPwdSystem.authEvents(events))
  }
}
