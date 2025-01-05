rootProject.name = "multiprojectexample"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

include("libs", "moduleA", "moduleB")