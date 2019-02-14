package com.sunny.mywifiapp.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @author KCrason
 * @date 2017/7/4
 */

public class ApiRequest {


    /**
     * RxJava构造器
     */

    private final static RxJavaCallAdapterFactory RX_JAVA_2_CALL_ADAPTER_FACTORY = RxJavaCallAdapterFactory.create();

    /**
     * Gson解析器
     */
    private final static GsonConverterFactory GSON_CONVERTER_FACTORY = GsonConverterFactory.create();

    /**
     * 返回String的构造器
     */
    private final static ScalarsConverterFactory SCALARS_CONVERTER_FACTORY = ScalarsConverterFactory.create();


    private final static OkHttpClient OK_HTTP_CLIENT = new OkHttpClient.Builder().retryOnConnectionFailure(true).build();

    private static Retrofit sGsonRetrofit, sScalarRetrofit;


    private static Retrofit generateRetrofit(String baseUrl, Converter.Factory factory) {
        return new Retrofit.Builder().baseUrl(baseUrl).client(OK_HTTP_CLIENT)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RX_JAVA_2_CALL_ADAPTER_FACTORY).build();
    }


    public static <S> S createService(Class<S> sClass, String baseUrl) {
        if (sGsonRetrofit == null) {
            sGsonRetrofit = generateRetrofit(baseUrl, GSON_CONVERTER_FACTORY);
        } else {
            HttpUrl newHttpUrl = HttpUrl.parse(baseUrl);
            if (sGsonRetrofit.baseUrl().equals(newHttpUrl)) {
                return sGsonRetrofit.create(sClass);
            } else {
                sGsonRetrofit = generateRetrofit(baseUrl, GSON_CONVERTER_FACTORY);
            }
        }
        return sGsonRetrofit.create(sClass);
    }

    /**
     * 构建返回String类型的retrofit,
     * 该构造器用于需要手动解析数据时使用
     */
    public static <S> S createScalarService(Class<S> sClass, String baseUrl) {
        if (sScalarRetrofit == null) {
            sScalarRetrofit = generateRetrofit(baseUrl, SCALARS_CONVERTER_FACTORY);
        } else {
            HttpUrl newHttpUrl = HttpUrl.parse(baseUrl);
            if (sScalarRetrofit.baseUrl().equals(newHttpUrl)) {
                //如果请求的HttpUrl和上次相同，则返回原有retrofit对象
                return sScalarRetrofit.create(sClass);
            } else {
                //否则，构建新的retrofit对象
                sScalarRetrofit = generateRetrofit(baseUrl, SCALARS_CONVERTER_FACTORY);
            }
        }
        return sScalarRetrofit.create(sClass);
    }
}
