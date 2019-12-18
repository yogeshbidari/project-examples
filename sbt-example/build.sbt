//assemblyJarName := s"AppName v${version.value}.jar"

//ThisBuild / useCoursier := false

//ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.12.10"
  )

//resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/Test/"

resolvers ++= Seq(
    "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
    "releases" at "http://oss.sonatype.org/content/repositories/releases"
    )


//Resolvers += Resolver.sonatypeRepo("releases")
  
//resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test")

//publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/Test;build.timestamp=" + new java.util.Date().getTime)

credentials += Credentials("Artifactory Realm", "shanmukha420.jfrog.io", "admin", "Ph2Un3Ri2Ly1Wi")

//credentials += Credentials(new File("credentials.properties"))

//credentials += Credentials("Artifactory Realm", "https://shanmukha420.jfrog.io", "admin", "Ph2Un3Ri2Ly1Wi")

//addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.6")

libraryDependencies += "org.scala-lang" % "scala-library" % "2.12.10"
libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
libraryDependencies += "org.specs2" % "specs2_2.12.10-RC3" % "2.3.10"
