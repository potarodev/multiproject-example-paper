plugins {
    kotlin("jvm") version "2.1.20-Beta1"
    id("com.gradleup.shadow") version "8.3.5"
}

group = "dev.potaro.multiprojectexample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    // libs should be compileOnly if implementation is shadowed in :libs subproject
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

val targetJavaVersion = 21
kotlin {
    jvmToolchain(targetJavaVersion)
}

tasks.processResources {
    val props = mapOf("version" to version)
    inputs.properties(props)
    filteringCharset = "UTF-8"
    filesMatching("plugin.yml") {
        expand(props)
    }
}