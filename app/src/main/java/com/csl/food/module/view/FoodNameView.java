package com.csl.food.module.view;

import com.csl.food.base.BaseView;
import com.csl.food.bean.FoodEntity;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.view
 * @Fuction : 食品名称查询视图接口
 * @anthor :csl QQ:870588442
 * @time :2016/12/13 14:58
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodNameView extends BaseView {
    void initViewPager(FoodEntity foodName);
}
