package com.example.app

import org.scalatra.test.scalatest.ScalatraFunSuite

trait MyScalatraFunSuite extends ScalatraFunSuite {

  val projectPath = getClass.getClassLoader.getResource("").toURI.resolve("../../..")
  servletContextHandler.setResourceBase(s"${projectPath}/${resourceBasePath}")

}
