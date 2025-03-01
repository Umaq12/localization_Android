plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}
repositories {
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "localization_Android"
            url = uri("https://maven.pkg.github.com/umaq12/localization_android")
            credentials {
                username = "umaq12"
                password = ""
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["kotlin"])
            groupId = "com.github.umaq12"
            version = "1.0.3"
            artifactId = "localization_android"
        }
    }
}