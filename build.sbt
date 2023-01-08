name := "scalabytes"
organization := "com.yadavan88"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"

lazy val scala2 = (project in file("scala2"))
  .settings(
    name := "scala2",
    scalaVersion := "2.13.10",
    libraryDependencies ++= List()
  )