plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "emailer"
include("kpo-emailer-app")
include("kpo-emailer-api")
