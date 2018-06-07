package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    val path = getServletContext().getRealPath("/WEB-INF/hello.txt")
    val content = scala.io.Source.fromFile(path).getLines().mkString

    Ok(content)
  }

}
