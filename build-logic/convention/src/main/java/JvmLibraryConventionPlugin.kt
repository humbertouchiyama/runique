import com.android.build.api.dsl.LibraryExtension
import com.humberto.convention.ExtensionType
import com.humberto.convention.configureBuildTypes
import com.humberto.convention.configureKotlinAndroid
import com.humberto.convention.configureKotlinJvm
import com.humberto.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class JvmLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()
        }
    }
}