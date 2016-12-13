package com.csl.food.module.model;


import com.csl.food.callback.RequestCallback;

import rx.Subscription;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.model
 * @Fuction : 食品名称查询model层接口
 * @anthor :csl QQ:870588442
 * @time :2016/12/13 14:40
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodNameInteractor<T> {
    Subscription requestFoodName(RequestCallback<T> callback,String name);
}
