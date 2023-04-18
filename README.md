# androidM

KOTLIN: 

used emulator with mapping play store It is more complete 
************************************************************
java/res/drawable

image recommended vector asset, change your size, is not lack quality 
*******************************************************************
java/res/value

1) colors.xml: allow have colors for all applications, declared globally  
2) string.xml: allow have string for all applications, declared globally 
3)themes.xml: configuration style for whole app, configure in AndroiManifest.xml, specific activity used that themes, for default is "@style/Theme.AndroidM", in the same directory

******************************************************************


desain: in kotlin have 3 layouts  (inherits the dimensions of the parent wrap_content, son are is wrap_content)

1) FrameLayout: low level of use(It is used very little, but it serves to complement internal elements that do not require, spend a lot of time in its creation and operation)
2) LinearLayout: medium level of use (complement element into that ConstraintLayout, as button, text, image)
3)ConstraintLayout: high level of use (unlike the others, the attributes must be anchored, start, end, top, botton)

****************************************************************

android:text=”it shows”
tools:text=”it is a preview for the design”

***************************************************************
debut in android studio is more complet, show all variable in memory until debug, allow evaluate formulate in real time (evaluate expression, during debugger, click right button in that formulate (alt + F8))

****************************************************************
this Object allow create const in an Activity and access for other Activity, example ImcActivity IMC_KEY, is access for ResultIMCActivity

companion object{

************************************************************
dependencies than working main/app/build.gradle

plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace 'com.curso.androidm'
    compileSdk 33

    defaultConfig {
        applicationId "com.curso.androidm"
        minSdk 21
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }

    viewBinding {
        enable = true
    }
}




dependencies {

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.5.1'
    implementation 'com.google.android.material:material:1.7.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    //Retrofit
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"

    //Picasso
    implementation 'com.squareup.picasso:picasso:2.8'

    //DataStore
    implementation "androidx.datastore:datastore-preferences:1.0.0"

    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.4'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.0'


//    implementation 'androidx.core:core-ktx:+'
}

********************************************************
todo ready, recyclerview old, is no used recommendation:

 private lateinit var binding: ActivitySuperHeroListBinding

behind element allow behavior view in global element, and calling in whole activity 

*******************************************************

save data settings recommend for google DATASTORE PREFERENCES
save big data recommend for google data run 
