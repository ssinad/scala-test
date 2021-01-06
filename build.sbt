name := "SbtTest"

version := "1.0"

organization := "io.ssd352"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.0.1" %  "provided",
    "org.apache.spark" %% "spark-sql" % "3.0.1" %  "provided",
)