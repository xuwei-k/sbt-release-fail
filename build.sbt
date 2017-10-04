import ReleaseTransformations._
import sbtrelease.Version

name := "sbt-release failure"

normalizedName := "sbt-release-fail"

organization := "consulting.hindsight"

scalaVersion := "2.12.3"

releaseVersionBump := Version.Bump.Bugfix

releaseVersionFile := file("Version.sbt")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

publishTo := Some("releases" at "https://some.artifact.repo/") // Will never get this far, but required to build.