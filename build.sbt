organization  := "org.geneontology"

name          := "owl-diff"

version       := "1.2.2"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

licenses := Seq("BSD-3-Clause" -> url("https://opensource.org/licenses/BSD-3-Clause"))

homepage := Some(url("https://github.com/balhoff/owl-diff"))

scalaVersion  := "2.13.4"

crossScalaVersions := Seq("2.11.12", "2.12.12", "2.13.4")

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

scalacOptions in Test ++= Seq("-Yrangepos")

fork in Test := true

libraryDependencies ++= {
  Seq(
    "net.sourceforge.owlapi" %  "owlapi-distribution" % "4.5.10",
    "org.apache.commons"     %  "commons-text"        % "1.9"
  )
}

pomExtra :=
  <scm>
    <url>git@github.com:balhoff/owl-diff.git</url>
    <connection>scm:git:git@github.com:balhoff/owl-diff.git</connection>
  </scm>
    <developers>
      <developer>
        <id>balhoff</id>
        <name>Jim Balhoff</name>
        <email>jim@balhoff.org</email>
      </developer>
    </developers>
