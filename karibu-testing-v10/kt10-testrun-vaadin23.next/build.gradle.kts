dependencies {
    testImplementation("com.vaadin:vaadin:${properties["vaadin23_next_version"]}")
    testImplementation(project(":karibu-testing-v10:kt19-tests"))

    // for testing out the NPM template loading from META-INF/resources/frontend/
    testImplementation("com.github.appreciated:app-layout-addon:4.0.0.beta5")
}

// Vaadin 23 requires Java 11 or higher
tasks.test { onlyIf { JavaVersion.current() >= JavaVersion.VERSION_11 } }
