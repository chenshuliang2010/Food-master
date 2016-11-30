package com.csl.food.module.presenter;

import com.csl.food.base.BasePresenter;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.presenter
 * @Fuction : describe
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 23:17
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodListPresenter extends BasePresenter {
    void refreshData();

    void loadMoreData();
}
