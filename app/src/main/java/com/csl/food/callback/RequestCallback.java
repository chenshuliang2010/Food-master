package com.csl.food.callback;

/**
 * @name: Test-master
 * @class name：com.test.csl.callback
 * @Fuction : 网络请求监听基类
 * @anthor :csl QQ:870588442
 * @time :2016/11/15 23:57
 * @change:
 * @chang :time
 * @class :describe
 */
public interface RequestCallback<T> {
    /**
     * 请求之前调用
     */
    void beforeRequest();

    /**
     * 请求错误调用
     *
     * @param msg 错误信息
     */
    void requestError(String msg);

    /**
     * 请求完成调用
     */
    void requestComplete();

    /**
     * 请求成功调用
     *
     * @param data 数据
     */
    void requestSuccess(T data);
}
