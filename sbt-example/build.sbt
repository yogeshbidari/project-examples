ThisBuild / organization := "abc"
ThisBuild / version := "2.0-SNAPSHOT"
ThisBuild / scalacOptions += "-Ypartial-unification"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test;build.timestamp=" + new java.util.Date().getTime)
ThisBuild / updateOptions := updateOptions.value.withGigahorse(false)



resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"



//publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test;build.timestamp=" + new java.util.Date().getTime)
credentials += Credentials("Artifactory Realm", "shanmukha420.jfrog.io", "admin", "AP2Qq7MgHvUHHWTRZ5iEqxTgsAF")

libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
