plugins {
    java
    id("application")
}

repositories {
    mavenCentral()
}

application {
    mainClass = "Generator"
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}
