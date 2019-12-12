lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )


//resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"

name := "scala-2.10"

sbtPlugin := true

publishMavenStyle := false

//publishArtifact := false,
//publishArtifact in (Compile, packageBin) := true

publishArtifact in Test := true

// enable publishing the jar produced by `test:package`
publishArtifact in (Test, packageBin) := true

// enable publishing the test API jar
publishArtifact in (Test, packageDoc) := true

// enable publishing the test sources jar
publishArtifact in (Test, packageSrc) := true


publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test/")

resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"

credentials += Credentials(new File("credentials.properties"))


//publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test;build.timestamp=" + new java.util.Date().getTime)
//credentials += Credentials("Artifactory Realm", "shanmukha420.jfrog.io", "admin", "AP2Qq7MgHvUHHWTRZ5iEqxTgsAF")

libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
