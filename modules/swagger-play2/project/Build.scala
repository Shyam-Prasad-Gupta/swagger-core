import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {
  val appName = "swagger-play2"
  val appVersion = "1.2.0-SNAPSHOT"

  val appDependencies: Seq[sbt.ModuleID] = Seq(
    "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.0.0",
    "com.fasterxml.jackson.core" % "jackson-annotations" % "2.0.0",
    "org.slf4j" % "slf4j-api" % "1.6.4",
    "com.wordnik" % "swagger-core_2.9.1" % "1.2.0-SNAPSHOT",
    "com.wordnik" % "swagger-annotations_2.9.1" % "1.2.0-SNAPSHOT",
    "javax.ws.rs" % "jsr311-api" % "1.1.1")

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    organization := "com.wordnik",
    resolvers := Seq(
      Resolver.url("swagger-core-github-repo", url("http://wordnik.github.com/repository"))(Resolver.ivyStylePatterns),
      "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases",
      "java-net" at "http://download.java.net/maven/2",
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"))
}
