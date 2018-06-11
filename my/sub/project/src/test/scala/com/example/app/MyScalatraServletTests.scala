package com.example.app

import org.eclipse.jetty.servlet.ServletContextHandler
import org.scalatra.servlet.ScalatraListener
import org.scalatra.test.scalatest._

class MyScalatraServletTests extends MyScalatraFunSuite {

  addServlet(classOf[MyScalatraServlet], "/*")

  test("GET / on MyScalatraServlet should return status 200") {
    get("/") {
      status should equal (200)
      body should equal ("world")
    }
  }

}
