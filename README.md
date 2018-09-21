# AndroidFlavorAndObfuscation

# Android flavors
         1-use tag  productFlavors in build.gradle
         2-define more than one flavors
         3-we use android flavors to create multi version of an app
         EX: i will use 2 flavors one for paid app and another for free app
         4-so create 2 folders with the same package name one for free and another for paid
         5-each folder will contains java folder and res folder and
         then u can change all strings all app feature or even app style

# Example of android flavors go to build.gradle line 41 and see  productFlavors {} tag
  this is demo that has 2 version of my app free and paid u can see different if u change build variant from
  freeDebug to paidDebug or vice verses style ,color, app name and color change
