package com.sunny.mywifiapp.ui;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sunny.mywifiapp.R;
import com.sunny.mywifiapp.network.ApiRequest;
import com.sunny.mywifiapp.network.api.RequestApi;
import com.sunny.mywifiapp.network.bean.LocationBean;
import com.sunny.mywifiapp.network.bean.NetFixedPosition;
import com.sunny.mywifiapp.util.SystemInfo;
import com.xtc.log.LogUtil;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private boolean mLocationPermissionApproved = false;

    List<ScanResult> mWifiList;
    private WifiManager mWifiManager;

    private Button mBtnTest;
    private TextView mTvWifiResult;
    private TextView mTvLocationResult;
    private TextView mTvWifiSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mWifiList = new ArrayList<>();

        mWifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLocationPermissionApproved =
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED;
    }

    private void initView() {
        mBtnTest = (Button) findViewById(R.id.btn_test);
        mBtnTest.setOnClickListener(this);
        mTvWifiResult = (TextView) findViewById(R.id.tv_wifi_result);
        mTvWifiResult.setOnClickListener(this);
        mTvLocationResult = (TextView) findViewById(R.id.tv_location_result);
        mTvLocationResult.setOnClickListener(this);
        mTvWifiSize = (TextView) findViewById(R.id.tv_wifi_size);
        mTvWifiSize.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void requestLocation() {

//        String macs = SystemInfo.getNeighboringWifiInfo(mWifiManager, true);
//        Log.d(TAG, "wifi扫描结果：" + macs);
//        mTvWifiResult.setText("wifi扫描结果：" + macs);

        mWifiList = SystemInfo.getNeighboringWifiList(mWifiManager);

        mTvWifiSize.setText("扫描到的wifi数量："+ mWifiList.size());

        StringBuilder sb = new StringBuilder();
        int size = mWifiList.size();
        LogUtil.d(TAG, "wifi扫描结果，size：" + size);
        for (int i = 0; i < size; i++) {
            ScanResult result = mWifiList.get(i);
            if (result == null) {
                continue;
            }

            if (TextUtils.isEmpty(result.SSID)) {
                continue;
            }

            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(result.BSSID).append(",").append(result.level).append(",");

                sb.append(result.SSID);
        }

        Log.d(TAG, "wifi扫描结果：" + sb.toString());
        mTvWifiResult.setText("wifi扫描结果：" + sb.toString());

        NetFixedPosition netFixedPosition = new NetFixedPosition();
        netFixedPosition.setAccesstype(1);
        netFixedPosition.setBts("460,0,10250,206213765,85");

        netFixedPosition.setMacs(sb.toString());
        netFixedPosition.setMmac(SystemInfo.getMacInfo(this));
        netFixedPosition.setWatchId("142e87be454d4ab6ad7d6977a27050e318261609");

        /*
        HttpManager.getInstance(this).getHttpClient().request("http://location.watch.okii.com/", RequestApi.class)
                .fixedPosition(netFixedPosition)
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<LocationBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(LocationBean locationBean) {

                    }
                });

                */

        ApiRequest.createService(RequestApi.class, "http://location.watch.okii.com/")
                .fixedPosition(netFixedPosition)
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<LocationBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(LocationBean locationBean) {

                        StringBuilder sb = new StringBuilder();
                        sb.append("经度：").append(locationBean.getData().getLongitude()).append(" \n纬度：")
                                .append(locationBean.getData().getLatitude());

                        mTvLocationResult.setText(sb.toString());
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                mTvWifiSize.setText("");
                mTvWifiResult.setText("");
                mTvLocationResult.setText("");
                requestLocation();
                break;
            default:
                break;
        }
    }

}
