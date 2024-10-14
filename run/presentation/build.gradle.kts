plugins {
    alias(libs.plugins.runique.android.feature.ui)
    alias(libs.plugins.mapsplatformSecretsPlugin)
}

android {
    namespace = "com.humberto.run.presentation"
}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
}