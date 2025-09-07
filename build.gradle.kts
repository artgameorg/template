plugins {
    alias(libs.plugins.kotlin)
}

group = "io.github.artgameorg.${rootProject.name}"
version = property("project.version")!!

repositories {
    mavenCentral()
}

subprojects {
    group = rootProject.group
    version = rootProject.version
    repositories.addAll(rootProject.repositories)

    apply(plugin = libs.plugins.kotlin.get().pluginId)

    sourceSets.main {
        kotlin.srcDir("src")
        java.srcDir("src")
        resources.srcDir("resources")
    }

    sourceSets.test {
        kotlin.srcDir("test/src")
        java.srcDir("test/src")
        resources.srcDir("test/resources")
    }

    kotlin {
        jvmToolchain(21)
    }
}

tasks.jar {
    enabled = false
}

kotlin {
    jvmToolchain(21)
}