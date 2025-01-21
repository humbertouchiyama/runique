// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.kotlinSerialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.room) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.orgJetbrainsKotlinJvm) apply false
    alias(libs.plugins.androidDynamicFeature) apply false
    alias(libs.plugins.mapsplatformSecretsPlugin) apply false
    alias(libs.plugins.junit5) apply false
}

