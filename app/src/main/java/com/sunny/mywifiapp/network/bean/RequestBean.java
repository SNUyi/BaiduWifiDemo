package com.sunny.mywifiapp.network.bean;

/**
 * Created by sunlipeng on 2019/1/29.
 */
public class RequestBean {

    /**
     * watchId : 142e87be454d4ab6ad7d6977a27050e318261609
     * bts : 460,0,10250,206213765,85
     * mmac : 14:9f:b6:74:85:fa,-45,'EEBBK_FREE'
     * macs : 00:35:1a:1d:2d:60,-46,1|00:35:1a:1d:2d:62,-47,1|d4:ee:07:33:ac:d8,-49,1|f0:b4:29:3c:bf:21,-52,1|94:d4:69:fa:a5:61,-56,1|94:d4:69:fa:a5:60,-56,1|00:35:1a:2c:0f:c0,-66,1|00:35:1a:2c:0f:c2,-70,1
     */

    private String watchId;
    private String bts;
    private String mmac;
    private String macs;

    public String getWatchId() {
        return watchId;
    }

    public void setWatchId(String watchId) {
        this.watchId = watchId;
    }

    public String getBts() {
        return bts;
    }

    public void setBts(String bts) {
        this.bts = bts;
    }

    public String getMmac() {
        return mmac;
    }

    public void setMmac(String mmac) {
        this.mmac = mmac;
    }

    public String getMacs() {
        return macs;
    }

    public void setMacs(String macs) {
        this.macs = macs;
    }
}
