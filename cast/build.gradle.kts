@file:OptIn(ExperimentalWasmDsl::class)

import com.gradleup.librarian.gradle.Librarian
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
  jvm()
  js {
    nodejs()
  }
  wasmJs {
    nodejs()
  }
  wasmWasi {
    nodejs()
  }
  iosArm64()
  iosSimulatorArm64()
  iosX64()
  macosArm64()
  macosX64()
  watchosArm32()
  watchosArm64()
  watchosDeviceArm64()
  tvosArm64()
  tvosSimulatorArm64()
  tvosX64()
  linuxX64()
  linuxArm64()
  mingwX64()

  sourceSets.getByName("commonTest") {
    dependencies {
      implementation(kotlin("test"))
    }
  }
}


Librarian.module(project)

