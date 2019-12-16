assemblyJarName := s"AppName v${version.value}.jar"

lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

 resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/"
  
  //resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

  publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/")

  //credentials += Credentials(new File("credentials.properties"))

credentials += Credentials("Artifactory Realm", "https://shanmukha420.jfrog.io", "admin", "Ph2Un3Ri2Ly1Wi")

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
