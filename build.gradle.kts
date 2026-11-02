plugins {
    java
}

val mcVersion: String by project

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc"
    }
}

dependencies {
    // 26.1부터 Paper API 버전 형식은 "{MC버전}.build.{빌드번호}-{채널}"
    compileOnly("io.papermc.paper:paper-api:$mcVersion.build.+")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release = 25
    }

    processResources {
        val props = mapOf(
            "version" to project.version,
            "apiVersion" to mcVersion,
        )
        inputs.properties(props)
        filteringCharset = Charsets.UTF_8.name()
        filesMatching("plugin.yml") {
            expand(props)
        }
    }
}
