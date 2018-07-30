## Cordova Android Check Package Plugin

Plugin for the [Cordova](https://cordova.apache.org/) framework to check if an application is installed on Android.

## Installation
The plugin can be installed via [Cordova-CLI](https://cordova.apache.org/docs/es/latest/guide/cli/) and is publicly available on [npm](https://www.npmjs.com/package/cordova-android-check-package).

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

This software is released under the [ISC License](https://www.isc.org/downloads/software-support-policy/isc-license/)

Made by **@KbaylonH**