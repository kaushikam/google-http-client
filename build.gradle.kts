plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.http-client:google-http-client:1.34.0")
    implementation("com.google.http-client:google-http-client-jackson2:1.34.0")
    implementation("com.google.code.gson:gson:2.8.6")
}

group = "com.kaushikam"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_1_7
java.targetCompatibility = JavaVersion.VERSION_1_7

application {
    mainClassName = "com.kaushikam.google.Application"
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.kaushikam.google.Application"
    }
}




