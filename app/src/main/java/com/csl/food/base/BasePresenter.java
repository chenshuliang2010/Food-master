package com.csl.food.base;

/**
 * @name: Test-master
 * @class name：com.test.csl.base
 * @Fuction : 代理的基类
 * @anthor :csl QQ:870588442
 * @time :2016/11/15 23:55
 * @change:
 * @chang :time
 * @class :describe
 */
public interface BasePresenter {
    /**
     * 开始<br>
     * 用于做一些初始化的操作
     */
    void onResume();

    /**
     * 销毁<br>
     * 用于做一些销毁、回收等类型的操作
     */
    void onDestroy();
}
