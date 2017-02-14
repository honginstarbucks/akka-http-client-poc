name := "rest-poc"
version := "1.0"
organization := "com.example"

lazy val akkaREST  = project.in(file("akka-rest"))

lazy val actorREST =  project.in(file("actor-rest"))