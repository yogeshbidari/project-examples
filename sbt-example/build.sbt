import org.dmonix.sbt.MavenCentralPlugin._
import sbt.Developer

enablePlugins(MavenCentralPlugin)
sbtPlugin := true

name := "sbt-publish-settings-plugin"
organization := "org.dmonix.sbt"

lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

  resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/"

  publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/")

  //credentials += Credentials(new File("credentials.properties"))

credentials += Credentials("Artifactory Realm", "https://shanmukha420.jfrog.io", "admin", "Ph2Un3Ri2Ly1Wi")

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
