package com.sunny.mywifiapp.network.api;

import com.google.gson.JsonObject;
import com.sunny.mywifiapp.network.bean.LocationBean;
import com.sunny.mywifiapp.network.bean.NetFixedPosition;
import com.sunny.mywifiapp.network.bean.RequestBean;
import com.xtc.httplib.bean.NetBaseResult;

import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;
import rx.Single;

/**
 * Created by sunlipeng on 2019/1/29.
 */
public interface RequestApi {

    @Headers("Content-Type: application/json;charset=UTF-8")
    @POST("location/fixedPositionBaidu")
    Single<LocationBean> getLocation(@Body RequestBody requestBody);


    /**
     * 同步网络定位
     */
    @Headers({
            "Eebbk-Sign: F1188C5669509D0B8ED704DE51B079C5",
            "Base-Request-Param: {\"appId\":\"2\",\"deviceId\":\"unkown\",\"imFlag\":\"1\",\"mac\":\"02:00:00:00:00:00\",\"program\":\"watch\",\"registId\":0,\"timestamp\":\"2019-02-13 12:56:51\",\"token\":\"unkown\"}"
    })
    @POST("location/fixedPositionBaidu")
    Observable<LocationBean> fixedPosition(@Body NetFixedPosition bean);
}
