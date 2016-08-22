package com.github.yuweiguocn.demo.greendao;

import android.app.Application;
import com.facebook.stetho.Stetho;

/**
 * Application
 *
 * @author chenchong
 *         16/8/22
 *         下午5:50
 */
public class MyApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Stetho.initialize(Stetho.newInitializerBuilder(this)
        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
        .build());
  }
}
