pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { setUrl("https://androidx.dev/storage/compose-compiler/repository/") }
    }
}
rootProject.name = "resaca"

val ci = System.getenv("CI")
println("Running on CI flow: $ci")
if (ci == null || !ci.contains("Maven")) // Remove the sample app from Maven publication builds
    include(":sample")

include(
    ":resaca",
    ":resacahilt",
    ":resacakoin"
)
