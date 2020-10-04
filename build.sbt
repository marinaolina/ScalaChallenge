name := "ScalaChallenge"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "org.mockito" % "mockito-all" % "1.9.5" % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.1" % Test

)