package com.kbaylonh;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public class CheckPackagePlugin extends CordovaPlugin {

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView); 
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext){

    if("checkApp".equals(action)){
      String packageName = args.getString(0);
      List<ApplicationInfo> packages;
      PackageManager pm;

      pm = getPackageManager();        
      packages = pm.getInstalledApplications(0);
      for (ApplicationInfo packageInfo : packages) {
        if(packageInfo.packageName.equals(packageName)){
          callbackContext.sendPluginResult(new PluginResult(Status.OK));
          return true;
        }
      }

      callbackContext.sendPluginResult(new PluginResult(Status.ERROR));
      return true;
    }

    return false;
  }
}