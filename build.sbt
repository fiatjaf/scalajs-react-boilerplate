enablePlugins(ScalaJSPlugin)

name := "app"
scalaVersion := "3.1.1"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"
libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.7.0"
libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.7.0"
