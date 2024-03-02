plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":kpo-emailer-api"))
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
}
