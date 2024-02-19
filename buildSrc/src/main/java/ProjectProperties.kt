import org.gradle.api.JavaVersion

object ProjectProperties {

    object Test {
        const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Id {
        const val APPLICATION_ID = "com.example.wsh_aos"
    }

    object Files {
        const val CONSUMER_PROGUARD_FILES = "consumer-rules.pro"
        const val DEFAULT_PROGUARD_FILES = "proguard-android-optimize.txt"
        const val PROGUARD_FILES = "proguard-rules.pro"
    }

    object Versions {
        const val COMPILE_SDK = 33
        const val MIN_SDK = 26
        const val TARGET_SDK = 34
        const val JVM_TARGET = "1.8"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
        const val KOTLIN_COMPILER_EXTENSION = "1.4.3"

        val JAVA_VERSION = JavaVersion.VERSION_1_8
    }

    object NameSpace {
        const val PRESENTATION = "com.example.presentation"
        const val DOMAIN = "com.example.domain"
        const val DATA = "com.example.data"
        const val APP = "com.example.wsh_aos"
        const val DI = "com.example.di"
    }
}