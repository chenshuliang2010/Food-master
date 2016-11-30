package com.csl.food.module.model;

import com.csl.food.callback.RequestCallback;

import rx.Subscription;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.model
 * @Fuction : describe
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 23:10
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodListInteractor<T> {
    Subscription requestFoodList(RequestCallback<T> callback);
}
