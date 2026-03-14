plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "io.github.leexda21.stub"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    annotationProcessor(libs.rikka.refineAnnotationProcessor)
    compileOnly(libs.rikka.refineAnnotation)
}
