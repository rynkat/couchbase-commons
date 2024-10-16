plugins {
    id("com.coditory.integration-test") version "2.0.1"
    `idea`
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("io.micrometer:micrometer-core:1.13.6")
    api(group = "com.couchbase.client", name = "java-client", version = "3.7.4")
    api(group = "com.couchbase.client", name = "metrics-micrometer", version = "0.7.4")
    api(group = "com.fasterxml.jackson.module", name = "jackson-module-kotlin", version = "2.18.0")

    testImplementation(group = "io.kotest", name = "kotest-runner-junit5", version = "5.9.1")
    testImplementation(group = "io.kotest.extensions", name = "kotest-extensions-testcontainers", version = "2.0.2")
    testImplementation(group = "org.testcontainers", name = "couchbase", version = "1.20.2")
    testImplementation(group = "org.mockito.kotlin", name = "mockito-kotlin", version = "5.4.0")
}
