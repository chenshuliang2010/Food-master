package com.csl.food.http;

/**
 * @name: Test-master
 * @class name：com.test.csl.http
 * @Fuction : 请求接口
 * @anthor :csl QQ:870588442
 * @time :2016/11/16 16:01
 * @change:
 * @chang :time
 * @class :describe
 */
public class Api {
    //地址
    public static final String BASE_PHONENUMINFO_URL = "http://www.tngou.net/";
    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        switch (hostType) {
            case 1:
                return Api.BASE_PHONENUMINFO_URL;

        }
        return "";
    }
}
