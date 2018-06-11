package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    val path = getServletContext().getResource("/WEB-INF/hello.txt").getPath()
    val content = scala.io.Source.fromFile(path).getLines().mkString

    Ok(content)
  }

}
