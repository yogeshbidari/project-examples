lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

  resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"



publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test")
credentials += Credentials("Artifactory Realm", "shanmukha420.jfrog.io", "admin", "AP2Qq7MgHvUHHWTRZ5iEqxTgsAF")


  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
