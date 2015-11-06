name := "activator-akka-scala-guice"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaVersion  = "2.4.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor"   % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j"   % akkaVersion,
    "com.google.inject" %  "guice"        % "4.0",
    "net.codingwell"    %% "scala-guice"  % "4.0.0",
    "org.scalatest"     %% "scalatest"    % "2.2.5"     % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
  )
}

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)
