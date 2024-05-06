plugins {
    java
    id("application")
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("Generator")
}