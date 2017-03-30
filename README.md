https://travis-ci.org/xuwei-k/sbt-incremental-compiler-bug/builds/216688609#L470

```
[info] [warn] /tmp/sbt_cbbab331/test/y/src/main/scala/Main.scala:3: imported `Foo' is permanently hidden by definition of object Foo in package y
[info] [warn] import x.Foo
[info] [warn]          ^
[info] [error] /tmp/sbt_cbbab331/test/y/src/main/scala/Main.scala:6: not enough arguments for method apply: (a: Int, b: String)y.Foo in object Foo.
[info] [error] Unspecified value parameter b.
[info] [error]   val foo = Foo(1)
[info] [error]                ^
[info] [warn] one warning found
[info] [error] one error found
[info] [error] (y/compile:compileIncremental) Compilation failed
```
