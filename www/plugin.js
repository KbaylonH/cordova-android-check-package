
var exec = require('cordova/exec');

var PLUGIN_NAME = 'CheckPackagePlugin';

var CheckPackagePlugin = {
  checkApp: function(packageName, successCallback, errorCallback){
    exec(successCallback, errorCallback, PLUGIN_NAME, "checkApp", [packageName]);
  }
};

module.exports = CheckPackagePlugin;
