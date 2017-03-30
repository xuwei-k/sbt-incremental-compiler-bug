val commonSetttings = Seq(
  scalaVersion := "2.12.1"
)

val x = project.settings(
  commonSetttings
)

val y = project.settings(
  commonSetttings,
  TaskKey[Unit]("createFoo") := {
    val dir = (scalaSource in Compile).value
    IO.write(dir / "Foo.scala", "package y\n\ncase class Foo(a: Int, b: String)")
  }
).dependsOn(x)
