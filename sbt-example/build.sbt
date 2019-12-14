ThisBuild / organization := "com.abc.def"
ThisBuild / version := "2.0-SNAPSHOT"


name := "My Project"




lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

publishArtifact in root := true

 resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"

 publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test")

 credentials += Credentials(new File("credentials.properties"))

 libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"

