ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "me.ypan"

lazy val akkaQuickStart = (project in file("."))
  .settings(
    name := "AkkaQuickStart",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.13",
  )
