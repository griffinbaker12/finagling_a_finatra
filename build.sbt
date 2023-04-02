libraryDependencies += "com.twitter" %% "finatra-http-server" % "22.4.0"
libraryDependencies ++= Seq(
"org.apache.thrift" % "libthrift" % "0.10.0",
"com.twitter" %% "scrooge-core" % "22.7.0",
"com.twitter" %% "finagle-thrift" % "22.7.0")
addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "22.7.0")
libraryDependencies += "org.apache.maven" % "maven-core" % "3.8.4"
resolvers += Resolver.mavenCentral
libraryDependencies += "com.twitter" %% "finatra-thrift" % "22.4.0"
libraryDependencies += "com.twitter" %% "finagle-thrift" % "22.7.0"
val scroogeCore = "com.twitter" %% "scrooge-core" % "22.7.0"