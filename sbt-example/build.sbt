ThisBuild / organization := "com.abc.def"
ThisBuild / version := "2.0-SNAPSHOT"


name := "My Project"


releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("publish"),
  setNextVersion,
  commitNextVersion,
  pushChanges)


skip in publish := false


lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )


 resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"

 publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test")

 credentials += Credentials(new File("credentials.properties"))

 libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"

