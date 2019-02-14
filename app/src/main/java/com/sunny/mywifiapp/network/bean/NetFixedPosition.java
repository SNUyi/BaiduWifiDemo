package com.sunny.mywifiapp.network.bean;

/**
 * Created by sunlipeng on 2019/1/30.
 */
public class NetFixedPosition {

    /**
     * 手表账户ID,必填
     */
    private String watchId;

    /**
     * I3手表定位开关；0：关闭；1：打开
     */
    private Integer locationSwitch;

    /**
     * 手表的IMEI号,必填
     */
    private String imei;

    /**
     * 移动网关ip,必填
     */
    private String serverip;

    /**
     * 移动用户识别码,必填
     */
    private String imsi;

    /**
     * 无线网络类型:GSM/GPRS/EDGE/HSUPA/HSDPA/WCDMA,必填
     */
    private String network;

    /**
     * 行为,0：坐 1：走路 2: 跑步 3: 坐车 4: 睡觉,必填
     */
    private int behavior;

    /**
     * I3运动状态
     */
    private Integer motionState;

    /**
     * I3运动步数
     */
    private int steps;

    /**
     * 移动端接入网络方式 0: 移动网络 1: wifi网络,必填
     */
    private int accesstype;

    /**
     * 0:非cdma 1: cdma
     */
    private int cdma;

    /**
     * 接入基站信息
     * 非cdma格式为:mcc,mnc,lac,cellid,signal
     * cdma格式为:sid,nid,bid,lon,lat,singal(lon,lat可为空,格式为:sid,nid,bid,,,singal)
     */
    private String bts;

    /**
     * 周边基站信息（不含接入基站信息 ）
     * <p/>
     * 多个bts之间用“|”分割
     */
    private String nearbts;

    /**
     * 已连接热点mac信息；mac,signal,ssid(ssid可随意些,经测试,不影响结果)
     * 如：f0:7d:68:9e:18,-41,TPLink,
     */
    private String mmac;

    /**
     * wifi列表中mac信息；多个mac之间用“|”分割
     */
    private String macs;

    /**
     * 自1970年1月1日00:00:00开始的毫秒数
     */
    private long createTime;

    /**
     * 百度sdk读取到加密定位数据
     */
    private String baiduParams;

    /**
     * 百度用户唯一识别码
     */
    private String cuid;

    /**
     * 定位类型
     */
    private Integer fixedPositionScene;

    private String uid;

    public String getWatchId() {
        return watchId;
    }

    public void setWatchId(String watchId) {
        this.watchId = watchId;
    }

    public Integer getLocationSwitch() {
        return locationSwitch;
    }

    public void setLocationSwitch(Integer locationSwitch) {
        this.locationSwitch = locationSwitch;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getBehavior() {
        return behavior;
    }

    public void setBehavior(int behavior) {
        this.behavior = behavior;
    }

    public Integer getMotionState() {
        return motionState;
    }

    public void setMotionState(Integer motionState) {
        this.motionState = motionState;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAccesstype() {
        return accesstype;
    }

    public void setAccesstype(int accesstype) {
        this.accesstype = accesstype;
    }

    public int getCdma() {
        return cdma;
    }

    public void setCdma(int cdma) {
        this.cdma = cdma;
    }

    public String getBts() {
        return bts;
    }

    public void setBts(String bts) {
        this.bts = bts;
    }

    public String getNearbts() {
        return nearbts;
    }

    public void setNearbts(String nearbts) {
        this.nearbts = nearbts;
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

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getBaiduParams() {
        return baiduParams;
    }

    public void setBaiduParams(String baiduParams) {
        this.baiduParams = baiduParams;
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    public Integer getFixedPositionScene() {
        return fixedPositionScene;
    }

    public void setFixedPositionScene(Integer fixedPositionScene) {
        this.fixedPositionScene = fixedPositionScene;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "NetFixedPosition{" +
                "watchId='" + watchId + '\'' +
                ", locationSwitch=" + locationSwitch +
                ", imei='" + imei + '\'' +
                ", serverip='" + serverip + '\'' +
                ", imsi='" + imsi + '\'' +
                ", network='" + network + '\'' +
                ", behavior=" + behavior +
                ", motionState=" + motionState +
                ", steps=" + steps +
                ", accesstype=" + accesstype +
                ", cdma=" + cdma +
                ", bts='" + bts + '\'' +
                ", nearbts='" + nearbts + '\'' +
                ", mmac='" + mmac + '\'' +
                ", macs='" + macs + '\'' +
                ", createTime=" + createTime +
//                ", baiduParams='" + baiduParams + '\'' +
                ", cuid='" + cuid + '\'' +
                ", fixedPositionScene=" + fixedPositionScene +
                ", uid='" + uid + '\'' +
                '}';
    }
}
