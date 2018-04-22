lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
//      organization := "com.example",
      scalaVersion := "2.12.5"
    )),
    name := "scala-spigot-plugin",
    resolvers += "spigot-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/",
    libraryDependencies += "org.spigotmc" % "spigot-api" % "1.12.2-R0.1-SNAPSHOT" intransitive()
  )
