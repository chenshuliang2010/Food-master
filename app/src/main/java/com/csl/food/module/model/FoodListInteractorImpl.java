package com.csl.food.module.model;

import com.csl.food.base.BaseSubscriber;
import com.csl.food.bean.FoodSummary;
import com.csl.food.callback.RequestCallback;
import com.csl.food.http.manager.RetrofitManager;
import com.csl.food.http.service.FoodService;

import java.util.List;

import rx.Observable;
import rx.Subscription;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.model
 * @Fuction : 菜谱列表Model层接口实现
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 23:11
 * @change:
 * @chang :time
 * @class :describe
 */
public class FoodListInteractorImpl implements FoodListInteractor<List<FoodSummary.TngouEntity>> {
    @Override
    public Subscription requestFoodList(RequestCallback<List<FoodSummary.TngouEntity>> callback) {
        return RetrofitManager.getInstance(1)
                .getBox0fficeListObservable()
                .flatMap(new Func1<FoodSummary, Observable<FoodSummary.TngouEntity>>() {

                    @Override
                    public Observable<FoodSummary.TngouEntity> call(FoodSummary foodSummary) {
                        return Observable.from(foodSummary.tngou);
                    }
                })
                .toSortedList(new Func2<FoodSummary.TngouEntity, FoodSummary.TngouEntity, Integer>() {

                    @Override
                    public Integer call(FoodSummary.TngouEntity tngouEntity, FoodSummary.TngouEntity tngouEntity2) {
                        return tngouEntity.id == tngouEntity2.id ? 0 : -1;
                    }
                })
                .subscribe(new BaseSubscriber<>(callback));
    }
}
