Cordova Android Check Package Plugin

Plugin for the [Cordova][cordova] framework to check if an application is installed on Android.

## Instalation
The plugin can be installed via [Cordova-CLI][CLI] and is publicly available on [NPM][npm].

Execute from the projects root folder:

  $ cordova plugin add cordova-android-check-package

Or install the latest head version:
  
  $ cordova plugin add https://github.com/KbaylonH/cordova-android-check-package.git

For Ionic Project

  $ ionic cordova plugin add cordova-android-check-package

Or

  $ ionic cordova plugin add https://github.com/KbaylonH/cordova-android-check-package.git

## Usage

You need to pass the package name of the app. For example the package name for Whatsapp is com.whatsapp

```js
window.CheckPackagePlugin.checkApp('com.whatsapp', function(){
  console.log("Whatsapp is installed");
}, function(){
  console.log("Whatsapp is not installed");
});
````

## License

This software is released under the [ISC License][isc_license]

Made by **@KbaylonH**