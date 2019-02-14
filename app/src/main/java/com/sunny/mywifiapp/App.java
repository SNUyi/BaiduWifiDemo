package com.sunny.mywifiapp;

import android.app.Application;

import com.xtc.httplib.HttpManager;
import com.xtc.httplib.bean.AppInfo;
import com.xtc.httplib.okhttp.OnGetAppInfoListener;
import com.xtc.system.account.AppInfoImpl;

/**
 * Created by sunlipeng on 2019/2/1.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initHttpCreator();

    }

    /**
     * 初始化http创建器
     */
    private void initHttpCreator() {
        HttpManager.getInstance(this).setOnGetAppInfoListener(new OnGetAppInfoListener() {
            @Override
            public com.xtc.httplib.bean.AppInfo getAppInfo() {
                AppInfoImpl appInfo = AppInfoImpl.getDefaultInstance(getApplicationContext());
                AppInfo hotfixAppInfo = new AppInfo();
                hotfixAppInfo.setEncSwitch(appInfo.getEncSwitch());
                hotfixAppInfo.setGrey(appInfo.getGrey());
                hotfixAppInfo.setRsaPublicKey(appInfo.getRsaPublicKey());
                hotfixAppInfo.setVersion(appInfo.getVersion());
                return hotfixAppInfo;
            }
        });
    }
}
