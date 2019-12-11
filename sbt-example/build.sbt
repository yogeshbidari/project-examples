lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

  resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/TestRemote"

  publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/TestRemote")

  credentials += Credentials(new File("credentials.properties"))

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
