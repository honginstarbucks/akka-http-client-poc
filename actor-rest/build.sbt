
name := "akka-rest"

version := "1.0"

organization := "com.example"

libraryDependencies ++= {
  val akkaVersion = "2.4.17"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "de.heikoseeberger" %% "akka-http-circe" % "1.12.0",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "com.typesafe.akka" %% "akka-http-core" % "10.0.3",
    "com.typesafe.akka" %% "akka-http" % "10.0.3",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.0.3",
    "org.scalatest" %% "scalatest" % "2.2.0" % "test"
  )
}
