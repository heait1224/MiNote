plugins {
    id("com.android.application")
}

android {
    namespace = "net.micode.notes"
    compileSdk = 33

    defaultConfig {
        applicationId = "net.micode.notes"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packaging {
        resources.excludes.add("META-INF/DEPENDENCIES");
        resources.excludes.add("META-INF/NOTICE");
        resources.excludes.add("META-INF/LICENSE");
        resources.excludes.add("META-INF/LICENSE.txt");
        resources.excludes.add("META-INF/NOTICE.txt");
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //implementation(fileTree(mapOf("dir" to "D:\\IntelliJ IDEA 2023.2.3\\Note\\httpcomponents-client-4.5.14-bin\\lib", "include" to listOf("*.aar", "*.jar"), "exclude" to listOf())))
//    implementation(fileTree("D:/IntelliJ IDEA 2023.2.3/Note/httpcomponents-client-4.5.14-bin/lib") {
//        include("*.aar", "*.jar")
//    })


    implementation(files("D:\\IntelliJ IDEA 2023.2.3\\Note\\httpcomponents-client-4.5.14-bin\\lib\\httpclient-osgi-4.5.14.jar"))
    implementation(files("D:\\IntelliJ IDEA 2023.2.3\\Note\\httpcomponents-client-4.5.14-bin\\lib\\httpclient-win-4.5.14.jar"))
    implementation(files("D:\\IntelliJ IDEA 2023.2.3\\Note\\httpcomponents-client-4.5.14-bin\\lib\\httpcore-4.4.16.jar"))

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}