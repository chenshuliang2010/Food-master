package com.csl.food.app;

import android.app.Application;
import android.content.Context;

/**
 * @name: Test-master
 * @class name：com.test.csl.app
 * @Fuction : describe
 * @anthor :csl QQ:870588442
 * @time :2016/11/16 0:38
 * @change:
 * @chang :time
 * @class :describe
 */
public class App extends Application {
    private static Context sApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext=this;
    }
    // 获取ApplicationContext
    public static Context getContext() {
        return sApplicationContext;
    }
}

