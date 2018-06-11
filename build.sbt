
lazy val server = (project in file("my/sub/project"))
  .enablePlugins(SbtTwirl)
  .enablePlugins(ScalatraPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % "2.6.3",
      "org.scalatra" %% "scalatra-scalatest" % "2.6.3" % "test",
      "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
    )
  )
