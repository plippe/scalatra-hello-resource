package com.example.app

import org.scalatra.test.scalatest.ScalatraFunSuite

trait MyScalatraFunSuite extends ScalatraFunSuite {

  val projectName = "server"
  servletContextHandler.setResourceBase(s"${projectName}/${resourceBasePath}")

}
