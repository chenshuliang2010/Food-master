package com.csl.food.base;

/**
 * @name Test-master
 * @class name：com.test.csl.base
 * @class describe
 * @Fuction:视图基类
 * @anthor csl QQ:1032006226
 * @time 2016/11/15 23:42
 * @change
 * @chang time
 * @class describe
 */
public interface BaseView {
    /**
     * 通过toast提示用户
     * @param msg 提示的信息
     */
    void toast(String msg);

    /**
     * 显示进度
     */
    void showProgress();

    /**
     * 隐藏进度
     */
    void hideProgress();
}
