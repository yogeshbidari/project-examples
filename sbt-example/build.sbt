//ThisBuild / organization := "com.abc.def"
//ThisBuild / version := "2.0-SNAPSHOT"

//name := "My Project"

/*
lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )
  */

lazy val root =
  Project("sbt-my-plugin-root", file("."))
    .settings(noPublishing: _*)
    .aggregate(sbtMyPluginModule)



lazy val sbtMyPluginModule =
  Project("sbt-my-plugin-module", file("sbt-my-plugin-module"))
    .settings(publishSbtPlugin: _*)
    .settings(
      name := "sbt-my-plugin-module",
      organization := "com.my.org",
      sbtPlugin := true
    )


lazy val publishSbtPlugin = Seq(
  publishMavenStyle := true,
  publishArtifact in Test := false,
  publishTo := {
    val myrepo = "https://shanmukha420.jfrog.io/shanmukha420/"
    if (isSnapshot.value) Some("The Realm" at myrepo + "example-snapshot")
    else Some("The Realm" at myrepo + "releases")
  },
   credentials += Credentials(new File("credentials.properties"))
)


 //publishArtifact in root := true



//publishArtifact in Test := true

//updateOptions := updateOptions.value.withGigahorse(false)

//resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/"
//publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot")


/*
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishTo := {
  val Artifactory = "https://shanmukha420.jfrog.io/"
  if (isSnapshot.value)
    Some("snapshots" at Artifactory + "/shanmukha420/Test")
  else
    Some("releases"  at Artifactory + "/shanmukha420/Test")
}
*/


 credentials += Credentials(new File("credentials.properties"))

 libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"

