-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-verbose
#code to enable optimization
# Optimization is turned off by default
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*
-optimizations !method/inlining/*
-optimizationpasses 5
-allowaccessmodification

#to disable optimization
#-dontoptimize
#-dontpreverify
#Add the @Keep annotation to the code you want to keep
-keep public class com.bvo.androidflavorandobfuscation.model.PremierLeagueClubs
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Fragment
-keepclassmembers class * extends android.app.Activity {
public void *(android.view.View);
}
-keepclassmembers class **.R$* {
public static <fields>;
}
-keepattributes *Annotation*
#code to remove log commands from code
-assumenosideeffects class android.util.Log {
 public static *** d(...);
 public static *** i(...);
 public static *** v(...);
}
