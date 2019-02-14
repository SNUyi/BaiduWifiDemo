package com.sunny.mywifiapp.network.bean;

/**
 * Created by sunlipeng on 2019/1/29.
 */
public class LocationBean {

    /**
     * code : 000001
     * desc : success
     * data : {"id":null,"watchId":"142e87be454d4ab6ad7d6977a27050e318261609","createTime":1548732670632,"behavior":null,"uid":"0A1548722671273ameepdycuzdwcazh","latitude":22.816626,"longitude":113.821215,"radius":27,"type":2,"locateType":1,"baiduLatitude":null,"baiduLongitude":null,"baiduRadius":null,"baiduType":null,"wearStatus":null,"province":"广东省","city":"东莞市","region":"东莞市市辖区","baiduLocationConfig":{"baseStationSwitch":0,"encryptParamSwitch":1},"indoor":"1","markLoc":null,"isChannelScanner":null,"isWifiQuestion":null,"useFriendWifi":null,"recAddr":null,"schoolWifiChance":null,"schools":null,"useSalePointWifi":null,"friendCircle":null,"changeDistance":null,"locationStrategyType":null,"descForStrategy":"东莞市市辖区东门路24","zoneAddressContrail":null,"inCn":null,"lt":22.816626,"lg":113.821215}
     * pushError : null
     * errorSN : null
     */

    private String code;
    private String desc;
    private DataBean data;
    private Object pushError;
    private Object errorSN;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getPushError() {
        return pushError;
    }

    public void setPushError(Object pushError) {
        this.pushError = pushError;
    }

    public Object getErrorSN() {
        return errorSN;
    }

    public void setErrorSN(Object errorSN) {
        this.errorSN = errorSN;
    }

    public static class DataBean {
        /**
         * id : null
         * watchId : 142e87be454d4ab6ad7d6977a27050e318261609
         * createTime : 1548732670632
         * behavior : null
         * uid : 0A1548722671273ameepdycuzdwcazh
         * latitude : 22.816626
         * longitude : 113.821215
         * radius : 27
         * type : 2
         * locateType : 1
         * baiduLatitude : null
         * baiduLongitude : null
         * baiduRadius : null
         * baiduType : null
         * wearStatus : null
         * province : 广东省
         * city : 东莞市
         * region : 东莞市市辖区
         * baiduLocationConfig : {"baseStationSwitch":0,"encryptParamSwitch":1}
         * indoor : 1
         * markLoc : null
         * isChannelScanner : null
         * isWifiQuestion : null
         * useFriendWifi : null
         * recAddr : null
         * schoolWifiChance : null
         * schools : null
         * useSalePointWifi : null
         * friendCircle : null
         * changeDistance : null
         * locationStrategyType : null
         * descForStrategy : 东莞市市辖区东门路24
         * zoneAddressContrail : null
         * inCn : null
         * lt : 22.816626
         * lg : 113.821215
         */

        private Object id;
        private String watchId;
        private long createTime;
        private Object behavior;
        private String uid;
        private double latitude;
        private double longitude;
        private int radius;
        private int type;
        private int locateType;
        private Object baiduLatitude;
        private Object baiduLongitude;
        private Object baiduRadius;
        private Object baiduType;
        private Object wearStatus;
        private String province;
        private String city;
        private String region;
        private BaiduLocationConfigBean baiduLocationConfig;
        private String indoor;
        private Object markLoc;
        private Object isChannelScanner;
        private Object isWifiQuestion;
        private Object useFriendWifi;
        private Object recAddr;
        private Object schoolWifiChance;
        private Object schools;
        private Object useSalePointWifi;
        private Object friendCircle;
        private Object changeDistance;
        private Object locationStrategyType;
        private String descForStrategy;
        private Object zoneAddressContrail;
        private Object inCn;
        private double lt;
        private double lg;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public String getWatchId() {
            return watchId;
        }

        public void setWatchId(String watchId) {
            this.watchId = watchId;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public Object getBehavior() {
            return behavior;
        }

        public void setBehavior(Object behavior) {
            this.behavior = behavior;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getLocateType() {
            return locateType;
        }

        public void setLocateType(int locateType) {
            this.locateType = locateType;
        }

        public Object getBaiduLatitude() {
            return baiduLatitude;
        }

        public void setBaiduLatitude(Object baiduLatitude) {
            this.baiduLatitude = baiduLatitude;
        }

        public Object getBaiduLongitude() {
            return baiduLongitude;
        }

        public void setBaiduLongitude(Object baiduLongitude) {
            this.baiduLongitude = baiduLongitude;
        }

        public Object getBaiduRadius() {
            return baiduRadius;
        }

        public void setBaiduRadius(Object baiduRadius) {
            this.baiduRadius = baiduRadius;
        }

        public Object getBaiduType() {
            return baiduType;
        }

        public void setBaiduType(Object baiduType) {
            this.baiduType = baiduType;
        }

        public Object getWearStatus() {
            return wearStatus;
        }

        public void setWearStatus(Object wearStatus) {
            this.wearStatus = wearStatus;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public BaiduLocationConfigBean getBaiduLocationConfig() {
            return baiduLocationConfig;
        }

        public void setBaiduLocationConfig(BaiduLocationConfigBean baiduLocationConfig) {
            this.baiduLocationConfig = baiduLocationConfig;
        }

        public String getIndoor() {
            return indoor;
        }

        public void setIndoor(String indoor) {
            this.indoor = indoor;
        }

        public Object getMarkLoc() {
            return markLoc;
        }

        public void setMarkLoc(Object markLoc) {
            this.markLoc = markLoc;
        }

        public Object getIsChannelScanner() {
            return isChannelScanner;
        }

        public void setIsChannelScanner(Object isChannelScanner) {
            this.isChannelScanner = isChannelScanner;
        }

        public Object getIsWifiQuestion() {
            return isWifiQuestion;
        }

        public void setIsWifiQuestion(Object isWifiQuestion) {
            this.isWifiQuestion = isWifiQuestion;
        }

        public Object getUseFriendWifi() {
            return useFriendWifi;
        }

        public void setUseFriendWifi(Object useFriendWifi) {
            this.useFriendWifi = useFriendWifi;
        }

        public Object getRecAddr() {
            return recAddr;
        }

        public void setRecAddr(Object recAddr) {
            this.recAddr = recAddr;
        }

        public Object getSchoolWifiChance() {
            return schoolWifiChance;
        }

        public void setSchoolWifiChance(Object schoolWifiChance) {
            this.schoolWifiChance = schoolWifiChance;
        }

        public Object getSchools() {
            return schools;
        }

        public void setSchools(Object schools) {
            this.schools = schools;
        }

        public Object getUseSalePointWifi() {
            return useSalePointWifi;
        }

        public void setUseSalePointWifi(Object useSalePointWifi) {
            this.useSalePointWifi = useSalePointWifi;
        }

        public Object getFriendCircle() {
            return friendCircle;
        }

        public void setFriendCircle(Object friendCircle) {
            this.friendCircle = friendCircle;
        }

        public Object getChangeDistance() {
            return changeDistance;
        }

        public void setChangeDistance(Object changeDistance) {
            this.changeDistance = changeDistance;
        }

        public Object getLocationStrategyType() {
            return locationStrategyType;
        }

        public void setLocationStrategyType(Object locationStrategyType) {
            this.locationStrategyType = locationStrategyType;
        }

        public String getDescForStrategy() {
            return descForStrategy;
        }

        public void setDescForStrategy(String descForStrategy) {
            this.descForStrategy = descForStrategy;
        }

        public Object getZoneAddressContrail() {
            return zoneAddressContrail;
        }

        public void setZoneAddressContrail(Object zoneAddressContrail) {
            this.zoneAddressContrail = zoneAddressContrail;
        }

        public Object getInCn() {
            return inCn;
        }

        public void setInCn(Object inCn) {
            this.inCn = inCn;
        }

        public double getLt() {
            return lt;
        }

        public void setLt(double lt) {
            this.lt = lt;
        }

        public double getLg() {
            return lg;
        }

        public void setLg(double lg) {
            this.lg = lg;
        }

        public static class BaiduLocationConfigBean {
            /**
             * baseStationSwitch : 0
             * encryptParamSwitch : 1
             */

            private int baseStationSwitch;
            private int encryptParamSwitch;

            public int getBaseStationSwitch() {
                return baseStationSwitch;
            }

            public void setBaseStationSwitch(int baseStationSwitch) {
                this.baseStationSwitch = baseStationSwitch;
            }

            public int getEncryptParamSwitch() {
                return encryptParamSwitch;
            }

            public void setEncryptParamSwitch(int encryptParamSwitch) {
                this.encryptParamSwitch = encryptParamSwitch;
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", watchId='" + watchId + '\'' +
                    ", createTime=" + createTime +
                    ", behavior=" + behavior +
                    ", uid='" + uid + '\'' +
                    ", latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", radius=" + radius +
                    ", type=" + type +
                    ", locateType=" + locateType +
                    ", baiduLatitude=" + baiduLatitude +
                    ", baiduLongitude=" + baiduLongitude +
                    ", baiduRadius=" + baiduRadius +
                    ", baiduType=" + baiduType +
                    ", wearStatus=" + wearStatus +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", region='" + region + '\'' +
                    ", baiduLocationConfig=" + baiduLocationConfig +
                    ", indoor='" + indoor + '\'' +
                    ", markLoc=" + markLoc +
                    ", isChannelScanner=" + isChannelScanner +
                    ", isWifiQuestion=" + isWifiQuestion +
                    ", useFriendWifi=" + useFriendWifi +
                    ", recAddr=" + recAddr +
                    ", schoolWifiChance=" + schoolWifiChance +
                    ", schools=" + schools +
                    ", useSalePointWifi=" + useSalePointWifi +
                    ", friendCircle=" + friendCircle +
                    ", changeDistance=" + changeDistance +
                    ", locationStrategyType=" + locationStrategyType +
                    ", descForStrategy='" + descForStrategy + '\'' +
                    ", zoneAddressContrail=" + zoneAddressContrail +
                    ", inCn=" + inCn +
                    ", lt=" + lt +
                    ", lg=" + lg +
                    '}';
        }
    }



}
