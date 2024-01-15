plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.ivcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // Spring Boot
    implementation("org.springframework.security:spring-security-oauth2-jose:6.2.1")

    testImplementation(kotlin("test"))
    testImplementation("org.mockito:mockito-core:5.8.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    explicitApi()
    jvmToolchain(17)
}