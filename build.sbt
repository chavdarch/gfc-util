name := "gfc-util"

organization := "com.gilt"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7", "2.10.5")

libraryDependencies ++= Seq(
  "com.gilt" %% "gfc-collection" % "0.0.3",
  "commons-codec" % "commons-codec" % "1.10",
  "com.gilt" %% "gfc-time" % "0.0.5" % "test",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.4" % "test"
)

releaseCrossBuild := true

releasePublishArtifactsAction := PgpKeys.publishSigned.value

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache-style" -> url("https://raw.githubusercontent.com/gilt/gfc-util/master/LICENSE"))

homepage := Some(url("https://github.com/gilt/gfc-util"))

pomExtra := (
  <scm>
    <url>https://github.com/gilt/gfc-util.git</url>
    <connection>scm:git:git@github.com:gilt/gfc-util.git</connection>
  </scm>
  <developers>
    <developer>
      <id>gheine</id>
      <name>Gregor Heine</name>
      <url>https://github.com/gheine</url>
    </developer>
    <developer>
      <id>ebowman</id>
      <name>Eric Bowman</name>
      <url>https://github.com/ebowman</url>
    </developer>
    <developer>
      <id>andreyk0</id>
      <name>Andrey Kartashov</name>
      <url>https://github.com/andreyk0</url>
    </developer>
  </developers>
)

