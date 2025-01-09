plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.humberto.analytics.presentation"
}

dependencies {
    implementation(projects.analytics.domain)
}