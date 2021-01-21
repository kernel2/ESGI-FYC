name := "LineCount"

version := "1.0"

scalaVersion := "2.13.0"

resolvers += "Hortonworks Releases" at "https://repo.hortonworks.com/content/groups/public"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.1.1.3.1.4.0-315"
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "3.1.1.3.1.4.0-315"
