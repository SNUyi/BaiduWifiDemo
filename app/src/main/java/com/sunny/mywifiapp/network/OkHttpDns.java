package com.sunny.mywifiapp.network;

import android.content.Context;
import android.util.Log;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import okhttp3.Dns;

/**
 * Created by sunlipeng on 2019/2/13.
 */
public class OkHttpDns implements Dns {
    private static final Dns SYSTEM = Dns.SYSTEM;
    private static OkHttpDns instance = null;

    public static OkHttpDns getInstance() {
        if(instance == null) {
            instance = new OkHttpDns();
        }
        return instance;
    }
    @Override
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        //通过异步解析接口获取ip
            //如果ip不为null，直接使用该ip进行网络请求
            List<InetAddress> inetAddresses = Arrays.asList(InetAddress.getAllByName("http://119.29.29.29"));
            Log.e("OkHttpDns", "inetAddresses:" + inetAddresses);
            return inetAddresses;

    }
}
