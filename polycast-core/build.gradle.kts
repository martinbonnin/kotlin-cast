import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
  jvm()
}

Librarian.module(project)

