# AndroidFlavorAndObfuscation

# Android flavors
         1-use tag  productFlavors in build.gradle
         2-define more than one flavors
         3-we use android flavors to create multi version of an app
         EX: i will use 2 flavors one for paid app and another for free app
         4-so create 2 folders with the same package name one for free and another for paid
         5-each folder will contains java folder and res folder and
         then u can change all strings all app feature or even app style

# Example of android flavors
         go to build.gradle line 41 and see  productFlavors {} tag
         this is demo that has 2 version of my app free and paid u can see different if u change build variant from
         freeDebug to paidDebug or vice verses style ,color, app name and color change
         
# Obfuscation 
 Your android app is so vulnerable to theft
 Android APK no secure at all any other developer can get ur code and reuse it
 Do u know tha APK is just a zip file so anyone can extract it useing any zip file achiever
 and get ur code and publishing it to google play store
# Obfuscating is the way to secure ur code by writing rule in progurd-rules.pro
# Obfuscating creating code that is difficult for humans to understand
# ProGuard has also two other important functions:
         1-shrinking It shrink the code to by detecting and removing unused code.
         2-optimization It analyze and optimize the byte code.
# ProGuard technique steps [input]->  [shrinking] -> [optimization] -> [obfuscation] -> [output]

# Obfuscating gives some output files such as
         1-dump.txt : Describes the internal structure of all the class files in the APK.
         2-mapping.txt : Provides a translation between the original and obfuscated class, method, and field names.
         3-seeds.txt : Lists the classes and members that were not obfuscated.
         4-usage.txt : Lists the code that was removed from the APK.
# Obfuscating can be done in various ways:
         1-renaming all variables and class names
         2- moving methods between files, adding garbage code
         3-changing strings to int and so on
# Steps to use proguard in your project
         1-Enable Proguard in build.gradle file like this release { minifyEnabled true .... }
         2-Modify proguard-rules.pro file take a look at  progurd-rules.pro in project
         3- u can use -keep before class or method or field Adding -Keep on a class keeps the entire class as-is. Adding it on a method or field will keep the method/field
