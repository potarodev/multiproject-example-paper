plugins {
    java
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "dev.potaro.multiprojectexample"
version = "1.0-SNAPSHOT" // removable if you want

evaluationDependsOnChildren() // required for shadowJar task to be available

tasks {
    runServer {
        // add all shadowJar jars from subprojects as plugins
        rootProject.subprojects.forEach { project ->
            (project.tasks.findByName("shadowJar") as Jar?)
                ?.let { pluginJars(it.archiveFile) }
        }
        runPaper {
            disablePluginJarDetection() // disable trying to build root jar
        }
        minecraftVersion("1.21.4")
    }
}

// run-paper debugging
tasks.withType(xyz.jpenilla.runtask.task.AbstractRun::class) {
    javaLauncher = javaToolchains.launcherFor {
        vendor = JvmVendorSpec.JETBRAINS
        languageVersion = JavaLanguageVersion.of(21)
    }
    jvmArgs("-XX:+AllowEnhancedClassRedefinition")
}