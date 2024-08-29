name := """media-empire"""
organization := "com.creativeprimes"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "3.5.0"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
libraryDependencies += "org.scalatest" %% "scalatest-featurespec" % "3.2.18" % "test"

mainClass in reStart := Some("com.example.Main")
