/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

group = "eu.nitok.gradle"

dependencies {
    implementation(platform("org.testcontainers:testcontainers-bom:1.18.3"))
    api("org.testcontainers:testcontainers")
    api("org.testcontainers:mysql")
    api("org.testcontainers:postgresql")

    implementation("org.jooq:jooq-meta-extensions-liquibase:3.16.3")
    implementation("org.jooq:jooq-codegen:3.16.3")

    implementation("mysql:mysql-connector-java:8.0.33")
}
