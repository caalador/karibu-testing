dependencies {
    api("javax.servlet:javax.servlet-api:4.0.1")
    api(kotlin("stdlib-jdk8"))
    implementation("org.slf4j:slf4j-api:${properties["slf4j_version"]}")

    testImplementation("com.github.mvysny.dynatest:dynatest:${properties["dynatest_version"]}")
    testImplementation("org.slf4j:slf4j-simple:${properties["slf4j_version"]}")
}

kotlin {
    explicitApi()
}

val configureBintray = ext["configureBintray"] as (artifactId: String) -> Unit
configureBintray("mock-servlet-environment")
