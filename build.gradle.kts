plugins {
    System.getProperty("kotlinVersion")?.let {
        id("org.jetbrains.kotlin.multiplatform")
        kotlin("multiplatform") version it
    } ?: (kotlin("multiplatform") version "1.9.22")
}

group = "me.user"
version = "1.0-SNAPSHOT"

val hostOs = System.getProperty("os.name")

repositories {
    mavenCentral()
    google()
}

kotlin {
    androidNativeArm32()
    androidNativeArm64()
    androidNativeX86()
    androidNativeX64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()
    watchosX64()
    watchosArm32()
    watchosArm64()
    watchosSimulatorArm64()
    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
    linuxX64()
    linuxArm64()
    mingwX64()
}
