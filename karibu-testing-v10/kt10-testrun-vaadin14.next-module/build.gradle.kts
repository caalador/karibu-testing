dependencies {
    testImplementation("com.vaadin:vaadin:${properties["vaadin14_next_version"]}") {
        // Webjars are only needed when running in Vaadin 13 compatibility mode
        listOf("com.vaadin.webjar", "org.webjars.bowergithub.insites",
            "org.webjars.bowergithub.polymer", "org.webjars.bowergithub.polymerelements",
            "org.webjars.bowergithub.vaadin", "org.webjars.bowergithub.webcomponents")
            .forEach { exclude(group = it) }
    }
    testImplementation(project(":karibu-testing-v10:kt10-tests")) {
        exclude(group = "com.vaadin")
        exclude(group = "com.github.appreciated")
    }

    testImplementation("com.vaadin:vaadin-spring:12.3.3")
}
