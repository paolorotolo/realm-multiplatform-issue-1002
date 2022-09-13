plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.3.0-rc01").apply(false)
    id("com.android.library").version("7.3.0-rc01").apply(false)
    kotlin("android").version("1.7.10").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("io.realm.kotlin:gradle-plugin:1.2.0-ktor2-SNAPSHOT")
        classpath(kotlin("serialization", version = "1.7.10"))
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}