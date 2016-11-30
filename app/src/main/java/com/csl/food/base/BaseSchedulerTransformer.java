package com.csl.food.base;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @name: Test-master
 * @class name：com.test.csl.base
 * @Fuction : describe
 * @anthor :csl QQ:870588442
 * @time :2016/11/16 0:50
 * @change:定义了一个默认的线程模型，大多数情况下，我们都会在 io 线程发起 request，在主线程处理 response
 * @chang :time
 * @class :describe
 */
public class BaseSchedulerTransformer<T> implements Observable.Transformer<T, T> {

    @Override
    public Observable<T> call(Observable<T> tObservable) {
        return tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).unsubscribeOn(Schedulers.io());
    }

}