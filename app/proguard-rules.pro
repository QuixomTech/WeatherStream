# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface3
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep class * {
   public private *;
}
-ignorewarnings
#-keep class com.raizlabs.android.dbflow.** { *; }
#-keep class com.myproject.db.models.** { *; }
#-keep class * extends com.raizlabs.android.dbflow.config.DatabaseHolder { *; }
#-keep class com.raizlabs.android.dbflow.config.GeneratedDatabaseHolder
#-keep class * extends com.raizlabs.android.dbflow.config.BaseDatabaseDefinition { *; }