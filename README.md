[![Maven Central](https://img.shields.io/maven-central/v/net.mbonnin.cast/cast?style=flat-square)](https://central.sonatype.com/namespace/net.mbonnin.cast)

## kotlin-cast

kotlin-cast is a [polyfill](https://en.wikipedia.org/wiki/Polyfill_(programming)) for 3 functions that help you cast your Kotlin instances without going back in your typing flow:

```kotlin
inline fun <reified T : Any> Any?.safeAs(): T? = this as? T
inline fun <reified T : Any> Any?.cast(): T = this as T
inline fun <reified T : Any> Any?.assertedCast(message: () -> String): T = this as? T ?: throw AssertionError(message())
```

Import in your project:

```kotlin
[libraries]
cast = "net.mbonnin.cast:cast:0.0.1"
```

Usage:

```kotlin
val data: Any? = jsonToKotlin("{\"key\": \"value\"}")

val value = data.cast<Map<String, Any?>>()
  .get("key")
  .cast<String>() // YAYYYYY!!!

assertEquals("value", value) 
```

Using type inference makes it even shorter:

```kotlin
fun doStuff(foo: Foo) { ... }

val any: Any = TODO()

doStuff(any.cast()) // cast to Foo automatically
```

Those functions are part of the kotlin-stdlib but not public, mainly because they break some diagnostics:

```kotlin
val a = "Hello"
val b: Int = a as Int // IJ will tell you "this cast can never succeed"
val c: Int = a.cast<Int>() // You'll get a crash without a warning.
```

Learn more in [KT-8584](https://youtrack.jetbrains.com/issue/KT-8584/).

