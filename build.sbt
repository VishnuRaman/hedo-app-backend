ThisBuild / scalaVersion := "3.1.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "org.hedo"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "hedo-app-backend",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0-RC3",
      "dev.zio" %% "zio-test" % "2.0.0-RC3" % Test,
      "io.d11" %% "zhttp" % "2.0.0-RC4",
      "io.d11" %% "zhttp-test" % "2.0.0-RC4" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
