package com.csl.food.module.model;

import com.csl.food.base.BaseSubscriber;
import com.csl.food.bean.FoodEntity;
import com.csl.food.callback.RequestCallback;
import com.csl.food.http.manager.RetrofitManager;

import rx.Subscription;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.model
 * @Fuction : 食品名称查询model层接口实现
 * @anthor :csl QQ:870588442
 * @time :2016/12/13 14:50
 * @change:
 * @chang :time
 * @class :describe
 */
public class FoodNameInteractorImpl implements FoodNameInteractor<FoodEntity>{
    @Override
    public Subscription requestFoodName(final RequestCallback<FoodEntity> callback, String name) {

        return RetrofitManager.getInstance(1)
                .getFoodNameObservable(name)
                .subscribe(new BaseSubscriber<>(callback));
    }
}
