ThisBuild / scalaVersion   := "2.13.11"
ThisBuild / version        := "0.0.1"
ThisBuild / organization   := "dev.roeck"



Global / onChangedBuildSource := ReloadOnSourceChanges


lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(name := "trading-journal")
  .settings(dependencies)
  .settings(commonSettings)
  .settings(consoleSettings)



lazy val commonSettings = Seq(
  scalacOptions ++= List(
    "-encoding", "utf8",        
    "-feature",                 
    "-language:implicitConversions",
    "-language:existentials",
    "-language:higherKinds",
    "-unchecked",
    "-Werror",
    "-Xfatal-warnings",
    "-Ymacro-annotations",
    "-Ywarn-unused:imports"
  )
)

lazy val consoleSettings = Seq(
  Compile / console / scalacOptions --= Seq("-Ywarn-unused", "-Ywarn-unused-import")
)

lazy val compilerOptions = {
  val commonOptions = Seq(
    "-unchecked",
    "-deprecation",
    "-encoding",
    "-Ywarn-unused:imports"
  )

  scalacOptions ++= commonOptions
}


lazy val dependencies = 
  libraryDependencies ++= Dependencies.zioDependencies

