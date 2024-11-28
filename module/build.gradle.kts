import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}

Librarian.module(project)    kotlin {
  jvm()
}