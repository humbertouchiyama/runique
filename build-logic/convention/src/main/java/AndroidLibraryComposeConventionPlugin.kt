import com.android.build.api.dsl.LibraryExtension
import com.humberto.convention.ExtensionType
import com.humberto.convention.configureAndroidCompose
import com.humberto.convention.configureBuildTypes
import com.humberto.convention.configureKotlinAndroid
import com.humberto.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runique.android.library")
            }

            val extension = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }
}