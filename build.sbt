name := """speak-it-out"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Hibernate Integration for JPA (Java Persistence API)
libraryDependencies ++= Seq(
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final" // replace by your jpa implementation
)

libraryDependencies ++= Seq(

  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "angularjs" % "1.3.16",
  "org.webjars" % "angular-ui-bootstrap" % "0.13.0",
  "org.webjars" % "select2" % "4.0.0-2"

)

