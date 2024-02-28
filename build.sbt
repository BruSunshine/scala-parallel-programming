val scala3Version = "3.3.1"
scalaVersion := scala3Version

name := "scalaParallelProgramming"
version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test,
  ("org.apache.spark" %% "spark-core" % "3.5.0")
    .cross(CrossVersion.for3Use2_13),
  ("org.apache.spark" %% "spark-sql" % "3.5.0").cross(CrossVersion.for3Use2_13)
)

scalacOptions ++= Seq(
  "-Wunused:imports", // show warnings during compilation
  "-Ylog:typer"
)


Compile / unmanagedSourceDirectories += baseDirectory.value / "worksheets"
