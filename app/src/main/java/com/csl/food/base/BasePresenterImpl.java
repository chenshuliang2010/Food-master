package com.csl.food.base;

import android.support.annotation.CallSuper;
import com.csl.food.callback.RequestCallback;
import rx.Subscription;

/**
 * @name: Test-master
 * @class name：com.test.csl.base
 * @Fuction : 代理的基类实现
 * @anthor :csl QQ:870588442
 * @time :2016/11/15 23:59
 * @change:
 * @chang :time
 * @class :describe
 */
public class BasePresenterImpl<T extends BaseView, V> implements BasePresenter,RequestCallback<V> {
    protected Subscription mSubscription;
    protected T mView;

    /**
     * 构造方法
     *
     * @param view 具体业务的接口对象
     */
    public BasePresenterImpl(T view) {
        mView = view;
    }

    @Override
    public void beforeRequest() {
        //显示Loading
        mView.showProgress();
    }

    @CallSuper
    @Override
    public void requestError(String msg) {
        //通知UI具体的错误信息
        mView.hideProgress();
    }

    @Override
    public void requestComplete() {
        //隐藏Loading
        mView.hideProgress();
    }

    @Override
    public void requestSuccess(V data) {
        //将获取的数据回调给UI（activity或者fragment）
    }
    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        if (mSubscription != null && !mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
        mView = null;
    }
}
